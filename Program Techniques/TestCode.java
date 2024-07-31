public class TestCode {
	public static void main(String[] args ) {
		Rectangle rectangle = new Rectangle(2, 2);
		Circle circle = new Circle (2);
		System.out.println("Same area? " +
		equalArea(rectangle, circle));
	}
}