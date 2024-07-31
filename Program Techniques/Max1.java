// Max1.java: Find a maximum object
public class Max1 {
/** Return the maximum between two objects */
	public static <E extends Comparable<E>> E max(E o1, E o2) {
		if (o1.compareTo(o2) > 0)
			return o1;
		else
			return o2;
	}
	public static void main(String[] args ) {
			Max max = new Max();
			Max.max("Welcome", 23);
	}
}