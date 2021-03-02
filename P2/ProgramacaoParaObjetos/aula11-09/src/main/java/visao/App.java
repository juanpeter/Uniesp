package visao;

import java.util.Scanner;

public class App {
    
        public static float calcularArea(float altura, float base) {
            float a = altura * base;
            return a;
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        float b, h, area;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a base:");
        b = entrada.nextFloat();
        
        System.out.println("Digite a altura:");
        h = entrada.nextFloat();
        
        area = calcularArea(b, h);
        
        System.out.println("A área é: " + area);
    }
}
