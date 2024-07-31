import java.util.*;

public class ArrayListFromTo {
  public static void main(String[] args) {
    String[] array = {"red", "green", "blue"};
	ArrayList<String> list = new ArrayList<>(Arrays.asList(array));

    // Display
    for (int i = 0; i < list.size(); i++)
      System.out.print(list.get(i) + " ");

    String[] array1 = new String[list.size()];
    list.toArray(array1);
     // Display
     System.out.println();
    for (int i = 0; i < array1.length; i++)
      System.out.print(array1[i] + " ");

  }
}
