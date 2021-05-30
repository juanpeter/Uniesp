package modelo;

public class Circle extends Shape {

	public Circle() {}
	
	public Circle(Circle circle) {
		this.type = "Circle";
	}
	
	@Override
	public Shape clone() {
		return new Circle(this);
	}

}
