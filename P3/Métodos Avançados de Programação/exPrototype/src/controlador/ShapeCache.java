package controlador;

import java.util.Hashtable;

import modelo.Circle;
import modelo.Rectangle;
import modelo.Shape;
import modelo.Square;

public class ShapeCache {

	private static Hashtable shapeMap = new Hashtable();
	
	public static Shape getShape(String id) {
		Shape cachedShape = (Shape)shapeMap.get(id);
		return cachedShape;
	}
	
	public static void loadCache() {
		Circle protoCircle = new Circle();
		
		Circle circle1 = (Circle) protoCircle.clone();
		circle1.setId(
				Integer.toString(shapeMap.size() + 1)
				);
		shapeMap.put(circle1.getId(), circle1);
		
		Square protoSquare = new Square();
		
		Square square1 = (Square) protoSquare.clone();
		square1.setId(
				Integer.toString(shapeMap.size() + 1)
				);
		shapeMap.put(square1.getId(), square1);
		
		Rectangle protoRectangle = new Rectangle();
		
		Rectangle rectangle1 = (Rectangle) protoRectangle.clone();
		rectangle1.setId(
				Integer.toString(shapeMap.size() + 1)
				);
		shapeMap.put(rectangle1.getId(), rectangle1);
		
		Circle circle2 = (Circle) protoCircle.clone();
		circle2.setId(
				Integer.toString(shapeMap.size() + 1)
				);
		shapeMap.put(circle2.getId(), circle2);
		
		Rectangle rectangle2 = (Rectangle) protoRectangle.clone();
		rectangle2.setId(
				Integer.toString(shapeMap.size() + 1)
				);
		shapeMap.put(rectangle2.getId(), rectangle2);
		
		Rectangle rectangle3 = (Rectangle) protoRectangle.clone();
		rectangle3.setId(
				Integer.toString(shapeMap.size() + 1)
				);
		shapeMap.put(rectangle3.getId(), rectangle3);
		
		Square square2 = (Square) protoSquare.clone();
		square2.setId(
				Integer.toString(shapeMap.size() + 1)
				);
		shapeMap.put(square2.getId(), square2);
		
	}
}
