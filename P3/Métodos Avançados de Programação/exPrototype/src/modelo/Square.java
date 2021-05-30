package modelo;

public class Square extends Shape {
	
	public Square() {}

	public Square(Square square) {
		this.type = "Square";
	}

	@Override
	public Shape clone() {
		return new Square(this);
	}
}
