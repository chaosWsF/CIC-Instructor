import java.util.*;
public class Casting {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("hello");
		String s = (String)list.get(0);
		System.out.println(s);
	}
}