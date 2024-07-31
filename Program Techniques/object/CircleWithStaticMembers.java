public class CircleWithStaticMembers {
	/** The radius of the circle */
	public double radius;

	/** The number of objects created */
	public static int numberOfObjects = 0;

		/** Construct a circle with radius 1 */
	public CircleWithStaticMembers() {
		radius = 1;
		numberOfObjects++;
	}

	/** Construct a circle with a specified radius */
	public CircleWithStaticMembers(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}

	/** Return numberOfObjects */
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	/** Return the area of this circle */
	public double getArea() {
		return radius * radius * Math.PI;
	}
}