/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote1;

/**
 *
 * @author João Pedro
 */
public class Media {
    
    public static void main(String[] args){
        float n1=10, n2 = 5;
        float media;
        
        media = (n1 + n2)/2;
        System.out.println(media);
        
        if(n1 == 10) {
            System.out.println("Dez");
        }
        else if(n1 == 20) {
            System.out.println("Vinte");
        }
        else {
            System.out.println("Nem dez nem vinte");
        }
        
        float a = 9.5f, b = 1;
        float resultado = 0;
        char operacao = '+';
        String op = "add";
        
        switch(operacao) {
            case '+':
                resultado =a+b;
                break;
            case '-':
                resultado =a-b;
                break;
            case '*':
                resultado =a*b;
                break;
            case '/':
                resultado =a/b;
                break;
            default:
                System.out.println("Operação inválida");
        }
        
        System.out.println("Resultado: " + resultado);
        
    }
}
