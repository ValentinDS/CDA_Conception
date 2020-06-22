package dp.visitor;

public class Triangle implements Figure {

	public void accept(DrawVisitor _visitor) {
		_visitor.visitTriangle(this);
		
	}
	
	
	
}
