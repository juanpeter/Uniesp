package visao;

import controlador.ShapeCache;
import modelo.Shape;

public class PrototypePatternDemo {

	public static void main(String args[]) {
		ShapeCache.loadCache();
		
		Shape clonedShape = ShapeCache.getShape("1");
		System.out.println(clonedShape.getType());
		
		Shape clonedShape2 = ShapeCache.getShape("2");
		System.out.println(clonedShape2.getType());
		
		Shape clonedShape3 = ShapeCache.getShape("3");
		System.out.println(clonedShape3.getType());
		
		Shape clonedShape4 = ShapeCache.getShape("4");
		System.out.println(clonedShape4.getType());
		
		Shape clonedShape5 = ShapeCache.getShape("5");
		System.out.println(clonedShape5.getType());
		
		Shape clonedShape6 = ShapeCache.getShape("6");
		System.out.println(clonedShape6.getType());
		
		Shape clonedShape7 = ShapeCache.getShape("7");
		System.out.println(clonedShape7.getType());
	}
}
