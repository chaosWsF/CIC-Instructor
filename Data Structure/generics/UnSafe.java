import java.util.*;
public class UnSafe {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("hello");
		list.add(12);
		//String s = list.get(0);
		Integer s = (Integer)list.get(0);
		System.out.println(s);
	}
}