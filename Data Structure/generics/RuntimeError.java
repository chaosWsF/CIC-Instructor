import java.util.*;
public class RuntimeError {
	public static void main(String[] args) {
		Comparable c = new Date();
		System.out.println(c.compareTo("red"));
	}
}