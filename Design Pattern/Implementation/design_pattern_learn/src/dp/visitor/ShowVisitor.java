package dp.visitor;

public class ShowVisitor implements DrawVisitor {

	@Override
	public void visitSquare(Square _square) {
		System.out.println("Il s'agit d'un carré !");
		
	}

	@Override
	public void visitTriangle(Triangle _triangle) {
		System.out.println("Il s'agit d'un triangle !");
		
	}

}
