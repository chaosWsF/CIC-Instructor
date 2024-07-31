public class GenericStaticMethodDemo {
	 public static void main(String[] args ) {
		 Integer[] integers = {1, 2, 3, 4, 5};
		 String[] strings = {"London", "Paris", "New York", "Austin"};

		 GenericStaticMethodDemo.<Integer>print(integers);
		 GenericStaticMethodDemo.<String>print(strings);
	 }
		//generic static method definition
	 public static <E> void print(E[] list) {
		 for (int i = 0; i < list.length; i++)
		 	System.out.print(list[i] + " ");
		 System.out.println();
	 }


 }