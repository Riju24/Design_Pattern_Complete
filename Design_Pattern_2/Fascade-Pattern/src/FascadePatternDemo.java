
public class FascadePatternDemo {

	public static void main(String args[])
	{
		ShapeMaker shapeMaker = new ShapeMaker();
		
		System.out.println("For Circle");
		shapeMaker.drawCircle();
		System.out.println("\n\nFor Rectangle");
		shapeMaker.drawRectangle();
		System.out.println("\n\nFor Square");
		shapeMaker.drawSquare();
	}
}
