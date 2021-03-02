package pacote1;
/**
*
* @author João Pedro
*/

import java.lang.Math;

public class EquacaoSegundoGrau {
	public static void main(String[] args) {
		double a = 2.0;
		double b = 4.0;
		double c = 3.0;
		double x = (-b + Math.sqrt(Math.pow(b, b) - 4 * a * c)) / 2 * a;
		System.out.println(x);
	}
}