import java.util.*;
public class SafeCode {
	public static void main(String[] args) {
		ArrayList<String> list_s = new ArrayList<>();
		list_s.add("hello");
		String s = list_s.get(0);
		System.out.println(s);


		list_s.add(12);
		Integer i = list_i.get(1);
		System.out.println(i);
	}
}