package modelo;

public class Rectangle extends Shape {

	public Rectangle() {}
	
	public Rectangle(Rectangle rectangle) {
		this.type = "Rectangle";
	}
	
	@Override
	public Shape clone() {
		return new Rectangle(this);
	}

}
