// Define the circle class with two constructors
public class SimpleCircle {
	public double radius;

	/** Construct a circle with radius 1 */
	public SimpleCircle() {
		radius = 1;
	}

	/** Construct a circle with a specified radius */
	public SimpleCircle(double newRadius) {
		radius = newRadius;
	}

	/** Return the area of this circle */
	public double getArea() {
		return radius * radius * Math.PI;
	}

	/** Return the perimeter of this circle */
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	/** Set a new radius for this circle */
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
}
