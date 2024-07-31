public class GenericStaticMethodDemo1 {
	 public static void main(String[] args ) {
		 Integer[] integers = {1, 2, 3, 4, 5};
		 String[] strings = {"London", "Paris", "New York", "Austin"};

		 print(strings);
	 }

//Object call root data type
	 public static void print(Object[] list) {
	  for (int i = 0; i < list.length; i++)
	  	System.out.print(list[i] + " ");
	  System.out.println();
	  }

 }