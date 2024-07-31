import java.util.*;
public class NoCasting {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		String s = list.get(0);  //no need to casting
		System.out.println(s);
	}
}