package dp.visitor;

public class DescribeVisitor implements DrawVisitor {

	@Override
	public void visitSquare(Square _square) {
		System.out.println("Il a quatre c�t�s.");
		
		
		
	}

	@Override
	public void visitTriangle(Triangle _triangle) {
		System.out.println("Il a trois c�t�s de m�me longueur.");
		
		
		
	}

}
