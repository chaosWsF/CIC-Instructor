package com.example.compass_app;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    float azimuth_angle;    // 0.0f
    private SensorManager compassSensorManger;
    Sensor accelerometer;
    Sensor magnetometer;
    TextView tv_degrees;
    ImageView iv_compass;
    private float current_degree = 0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        compassSensorManger = (SensorManager) getSystemService(SENSOR_SERVICE);
        accelerometer = compassSensorManger.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        magnetometer = compassSensorManger.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);
    }

    protected void onPause() {
        super.onPause();
        compassSensorManger.unregisterListener(this);
    }

    protected void onResume() {
        super.onResume();
        compassSensorManger.registerListener(this, accelerometer, SensorManager.SENSOR_DELAY_UI);
        compassSensorManger.registerListener(this, magnetometer, SensorManager.SENSOR_DELAY_UI);
    }

    float[] accel_read;
    float[] magnetic_read;

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER)
            accel_read = event.values;

        if (event.sensor.getType() == Sensor.TYPE_MAGNETIC_FIELD)
            magnetic_read = event.values;

        tv_degrees = findViewById(R.id.tv_degrees);
        iv_compass = findViewById(R.id.iv_compass);
        if (accel_read != null && magnetic_read != null) {
            float[] R = new float[9];
            float[] I = new float[9];
            boolean successful_read = SensorManager.getRotationMatrix(R, I, accel_read, magnetic_read);

            if (successful_read) {
                float[] orientation = new float[3];
                SensorManager.getOrientation(R, orientation);
                azimuth_angle = orientation[0];    // radian
                float degrees = azimuth_angle * 180f / 3.14f;
                int degreeInt = Math.round(degrees);

                tv_degrees.setText(String.format(
                        Locale.CANADA, "%1$d %2$s to absolute north.", degreeInt, (char) 0x00B0)
                );

                RotateAnimation rotate = new RotateAnimation(
                        current_degree, -degreeInt,
                        Animation.RELATIVE_TO_SELF, 0.5f,
                        Animation.RELATIVE_TO_SELF, 0.5f
                        );
                rotate.setDuration(100);
                rotate.setFillAfter(true);

                iv_compass.startAnimation(rotate);
                current_degree = -degreeInt;
            }
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {}
}