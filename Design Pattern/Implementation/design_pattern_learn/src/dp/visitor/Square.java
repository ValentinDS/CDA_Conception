package dp.visitor;

public class Square implements Figure {

	@Override
	public void accept(DrawVisitor _visitor) {
		_visitor.visitSquare(this);
		
	}

}
