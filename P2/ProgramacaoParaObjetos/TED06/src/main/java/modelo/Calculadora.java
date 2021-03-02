/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Pedro
 */
public class Calculadora {
    private int numero1;
    private int numero2;

    public Calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public Calculadora() {}

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "Calculadora{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    
    public int soma(int numero1, int numero2) {
        return numero1 + numero2;
    }
    
    public int subtracao(int numero1, int numero2) {
        return numero1 - numero2;
    }
    
    public int multiplicacao(int numero1, int numero2) {
        return numero1 * numero2;
    }
    
    public int divisao(int numero1, int numero2) {
        return numero1 / numero2;
    }
}
