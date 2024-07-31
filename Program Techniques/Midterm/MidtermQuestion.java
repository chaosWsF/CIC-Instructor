public class MidtermQuestion {
  public static void main(String[] args) {
    int result = 0;

    for (int i = 1; i <= 5; i++) {
      if (i == 2 || i == 3) {
        continue;
      }
      result += i;
    }
  
    System.out.printf("The result is" + "%3d.", result);
  }
}