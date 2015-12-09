public class Pentagon implements Shape {

	private double sideLength;
	private static final int NUMSIDES = 5;

	public double getWidth() {
		return ((sideLength)/(2*Math.tan(36)));
	}

	public double getHeight() {
		return (((1+Math.sqrt(5))/2)*sideLength);
	}

	public double getArea() {
		return ((1/4)*Math.sqrt(5*(5+2*Math.sqrt(5)))*(sideLength*sideLength));
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}

	public double getPerimeter() {
		return sideLength*5;
	}

	public double getInteriorAngle() {
		return 180*(NUMSIDES-2) / NUMSIDES;
	}
	
	public int getNumSides() {
		return NUMSIDES;
	}

	public double getSideLength() {
		return sideLength;
	}
}
