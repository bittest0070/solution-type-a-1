package problem03;

public class Rectangle extends Shape implements Resizable {

	private double width;
	private double height;

	public Rectangle(double width, double height) {
		System.out.println("2");
		
	}

	@Override
	public void resize(double rate) {
		double area = (width*height)*rate;		
		
	}

	@Override
	public double getArea() {
		double area = (width*height);
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter= (width+height)*2;
		return perimeter;
	}
}