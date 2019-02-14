package problem03;

public class RectTriangle extends Shape {
	private double width;
	private double height;

	public RectTriangle(double width, double height) {
		
		
	}

	@Override
	public double getArea() {
		double area = (width*height);
		Math.sqrt(area);
		System.out.println("11");
		return 0.;
	}

	@Override
	public double getPerimeter() {
		double perimeter= (width+height)*2;		
		return perimeter;
	}

}
