public class StringbuilderExam{
  public static void main(String[] args) {
	StringBuilder stringBuilder = new StringBuilder();
	stringBuilder.append("Welcome");
	stringBuilder.append(' ');
	stringBuilder.append("to");
	stringBuilder.append(' ');
	stringBuilder.append("Java");
	stringBuilder.delete(8, 11);


	String s = stringBuilder.toString();

	stringBuilder.reverse();

	String s1 = stringBuilder.toString();

	System.out.println(s);
	System.out.println(s1);

  }
}