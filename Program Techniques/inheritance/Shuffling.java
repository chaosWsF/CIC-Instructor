import java.util.*;

public class Shuffling {
  public static void main(String[] args) {
   Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
   ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
   java.util.Collections.shuffle(list);
	System.out.println(list);


  }
}
