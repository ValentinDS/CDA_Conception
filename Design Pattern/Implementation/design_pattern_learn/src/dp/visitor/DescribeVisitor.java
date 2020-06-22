package dp.visitor;

public class DescribeVisitor implements DrawVisitor {

	@Override
	public void visitSquare(Square _square) {
		System.out.println("Il a quatre côtés.");
		
		
		
	}

	@Override
	public void visitTriangle(Triangle _triangle) {
		System.out.println("Il a trois côtés de même longueur.");
		
		
		
	}

}
