
public class Hexagon implements Shape {
	
	private double sideLength;
	private int numsides = 6;
	
	public double getWidth() {
		double width = (sideLength * 2)	;
		return width;
	}

	public double getHeight() {
		double height = (Math.sqrt(3)*sideLength);
		return height;
	}

	public double getArea() {
		double area = ((3 * Math.sqrt(3)) / 2) * (sideLength * sideLength);
		return area;
	}

	public void setSideLength(double sidelength) {
		sideLength = sidelength;
	}

	public double getPerimeter() {
		double perimeter = sideLength * numsides;
		return perimeter;
	}

	public double getInteriorAngle() {
		int interiorangle = ((numsides-2) * 180) / numsides;
		return interiorangle;
	}

	public int getNumSides() {
		return numsides;
	}

	public double getSideLength() {
		return sideLength;
	}
		
}
