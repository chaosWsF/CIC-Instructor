import java.util.*;
public class NeedCast {
	public static void main(String[] args ) {
		ArrayList list = new ArrayList();
		list.add(5.5); // 5.5 is automatically converted to new Double(5.5)
		list.add(3.0); // 3.0 is automatically converted to new Double(3.0)
		Double doubleObject = (Double)list.get(0); //
		double d = (double)list.get(1); // explicitly converted to double (casting)
		System.out.println("Double: " + doubleObject);
		System.out.println("double: " + d);
	}
}