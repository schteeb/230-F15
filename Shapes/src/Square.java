public class Square implements Shape {
	
	public int ns = 4;
	public double SideLength = 5;
	//number sides



	@Override
	public double getWidth() {
		// TODO Auto-generated method stub
		return SideLength;
	}

	@Override
	public double getHeight() {
		// TODO Auto-generated method stub
		return SideLength;
	}

	@Override
	public double getArea() {
		return SideLength * SideLength; 
	}

	@Override
	public double getInteriorAngle() {
		// TODO Auto-generated method stub
		//-Nate tazewell
		//since square will always have 90 degree angles
		return 90;
	}

	@Override
	public int getNumSides() {
		// TODO Auto-generated method stub
		//-Nate tazewell
		//returns the number of sides in the shape  
		return  ns;
	}

	public double getSideLength() {
		return SideLength; 
		//- steph d'andrea
	}
	
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return SideLength * 4;
	}

@Override
	public void setSideLength(double sideLength) {
		// TODO Auto-generated method stub
		SideLength = sideLength;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}


}
