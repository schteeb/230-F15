
public class Triangle implements Shape{

	private int NumSide = 3;
	private double sideLength;

	public double getWidth() {
		return getSideLength();
	};
	public double getHeight() {
		return (getArea()/0.5*getSideLength());
	};
	public double getArea() {
		return 0.5*getSideLength()*3;
	};
	public void setSideLength(double sideLength) {
		this.sideLength=sideLength;
	};
	public double getPerimeter() {
		return getNumSides()*getSideLength();
	};
	public double getInteriorAngle() {
		return 180 / 3;
	};
	public int getNumSides() {
		return NumSide;
	};
	public double getSideLength() {
		return sideLength;
	};
	
	public Triangle(double sideLength) {
		setSideLength(sideLength);
	}
}
