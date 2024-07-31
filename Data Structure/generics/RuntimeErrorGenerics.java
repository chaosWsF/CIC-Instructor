import java.util.*;
public class RuntimeErrorGenerics {
	public static void main(String[] args) {
		Comparable<Date> c = new Date();
		System.out.println(c.compareTo("red"));
	}
}