package com.example.sossender;

import androidx.annotation.NonNull;
import android.Manifest.permission;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.widget.Button;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private double latitude = 0;
    private double longitude = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButtonListenerMethod();
        GPSReceiver receiver = new GPSReceiver();
        LocationManager manager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(this, permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this,
                permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            int LOCATION_PERMISSIONS_REQUEST = 99;
            ActivityCompat.requestPermissions(this, new String[] {permission.ACCESS_FINE_LOCATION,
                    permission.ACCESS_COARSE_LOCATION}, LOCATION_PERMISSIONS_REQUEST);
        } else {
            Toast.makeText(this, "Location Permission Granted.", Toast.LENGTH_LONG).show();
        }
        manager.requestLocationUpdates(LocationManager.GPS_PROVIDER,
                1000L, 1.0F, receiver);
    }

    public void myButtonListenerMethod() {
        Button button = findViewById(R.id.sendSOS);
        button.setOnClickListener(
                v -> {
                    SmsManager sms = SmsManager.getDefault();
                    String phoneNumber = "x-xxx-xxx-xxxx";    // Use a phone number for testing
                    String messageBody = String.format(Locale.CANADA,
                            "Please take me from longitude: %.4f and latitude: %.4f",
                                   longitude, latitude);

                    try {
                        sms.sendTextMessage(phoneNumber, null, messageBody, null, null);
                        Toast.makeText(getApplicationContext(), "S.O.S. message sent!", Toast.LENGTH_LONG).show();
                    } catch (Exception e) {
                        Toast.makeText(getApplicationContext(),
                                String.format(Locale.CANADA,
                                        "Failed to send message to (%.4f, %.4f)!\n Exception: %s",
                                        latitude, longitude, e.getMessage()),
                                Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public class GPSReceiver implements LocationListener {
        @Override
        public void onLocationChanged(Location location) {
            if (location != null) {
                latitude = location.getLatitude();
                longitude = location.getLongitude();
                Toast.makeText(getApplicationContext(), "READY TO SEND! (Location changed.)",
                        Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(getApplicationContext(), "NOT READY YET… (Location is null.)",
                        Toast.LENGTH_LONG).show();
            }
        }

        @Override
        public void onProviderEnabled(@NonNull String provider) {
            Toast.makeText(getApplicationContext(), "GPS Enabled!", Toast.LENGTH_LONG).show();
        }

        @Override
        public void onProviderDisabled(@NonNull String provider) {
            Toast.makeText(getApplicationContext(), "Please enable GPS!", Toast.LENGTH_LONG).show();
        }
    }
}