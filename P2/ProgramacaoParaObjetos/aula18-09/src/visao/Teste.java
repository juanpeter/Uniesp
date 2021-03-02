package visao;

import javax.swing.JOptionPane;

import modelo.*;

public class Teste {

	public static void main(String[] args) {
		
		String r1_string;
		float r1;
		Circulo c, c2;
		
		r1_string = JOptionPane.showInputDialog("Digite o valor do raio");
		r1 = Float.parseFloat(r1_string);
		
		c = new Circulo(r1);
		
		c.setRaio(7);
		
		JOptionPane.showMessageDialog(null, "Area do Círculo é " + c.calcularArea());		
		
		c2 = new Circulo(23);
		
//		System.out.println("Digite o valor do Raio: ");
//		Scanner entrada = new Scanner(System.in);
//		float r1 = entrada.nextFloat();
//		
//		Circulo c = new Circulo(r1);
//		
//		System.out.println("Area do Círculo é" + c.calcularArea());
//		
//		entrada.close();
	}
}
