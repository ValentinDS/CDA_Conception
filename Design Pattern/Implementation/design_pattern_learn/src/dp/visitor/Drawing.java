package dp.visitor;

public class Drawing {
	
	private Square square;
	private Triangle triangle;
	
	public Drawing(Square _square, Triangle _triangle) {
		square = _square;
		triangle = _triangle;
			
	}
	
	public Square getSquare() {
		return square;
		
	}
	
	public Triangle getTriangle() {
		return triangle;
		
	}
	
	public void setSquare(Square _square) {
		square = _square;
	}
	
	public void setTriangle(Triangle _triangle) {
		triangle = _triangle;
	}

}
