import java.util.*;
public class NoNeedCast {
	public static void main(String[] args ) {
		ArrayList<Double> list = new ArrayList<>();
		list.add(5.5); // 5.5 is automatically converted to new Double(5.5)
		list.add(3.0); // 3.0 is automatically converted to new Double(3.0)
		Double doubleObject = list.get(0); // No casting is needed
		double d = list.get(1); // Automatically converted to double
		System.out.println("Double: " + doubleObject);
		System.out.println("double: " + d);
	}
}