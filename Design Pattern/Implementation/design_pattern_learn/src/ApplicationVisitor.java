import dp.visitor.*;

public class ApplicationVisitor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Square square = new Square();
		Triangle triangle = new Triangle();
		
		Drawing drawing = new Drawing(square, triangle);
		
		ShowVisitor show = new ShowVisitor();
		DescribeVisitor describe = new DescribeVisitor();
		
		drawing.getSquare().accept(show);
		drawing.getTriangle().accept(show);
		drawing.getSquare().accept(describe);
		drawing.getTriangle().accept(describe);
		
	}

}
