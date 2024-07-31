public class RecursiveSelectionSort {
	 public static void sort(double[] list) {
	 	sort(list, 0, list.length - 1); // Sort the entire list
	 }

	 private static void sort(double[] list, int low, int high) {
		 if (low < high) {
			 // Find the smallest number and its index in list[low .. high]
			 int indexOfMin = low;
			 double min = list[low];
			 for (int i = low + 1; i <= high; i++) {
				 if (list[i] < min) {
					 min = list[i];
					 indexOfMin = i;
				}
		    }

			 // Swap the smallest in list[low .. high] with list[low]
			 if (indexOfMin != low) {
				 list[indexOfMin] = list[low];
				 list[low] = min;
		 	 }

			 //Sort the remaining list[low+1 .. high]
			 sort(list, low + 1, high);
		}
	 }

	 public static void main(String[] args) {
	 	double[] list = {9, 1, 4.5, 6.6, 5.7, -4.5};
	 	sort(list);
		for (int i = 0; i <= list.length - 1; i++) {
			System.out.println(list[i]);
		}
	 }
 }