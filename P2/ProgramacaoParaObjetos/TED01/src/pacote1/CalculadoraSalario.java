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
public class CalculadoraSalario {
    public static void main(String[] args) {	
       
// Faça um programa que pergunte quanto você ganha por hora
// e o número de horas trabalhadas no mês.
// Calcule e mostre o
// total do seu salário no referido mês, sabendo-se que são descontados
// 11% para o Imposto de Renda,
// 8% para o INSS e
// 5% para o sindicato,
// faça um programa que nos dê:
// a. salário bruto.
// b. quanto pagou ao IPRF
// c. quanto pagou ao INSS.
// d. quanto pagou ao sindicato.
// e. o salário líquido.
// f. o valor descontado
    	
    double valorHora = 2.00;
    int horaTrabalhada = 400;

    double bruto = valorHora * horaTrabalhada;
    double descontoIprf = bruto * 11.0/100.0;
    double descontoInss = bruto * 8.0/100.0;
    double descontoSindicato = bruto * 5.0/100.0;
    double descontoTotal = descontoIprf + descontoInss + descontoSindicato;    
    double liquido =  bruto - descontoTotal;

    System.out.println("Seu salário bruto é R$" + bruto );
    System.out.println("Seu desconto de Imposto de Renda é de R$" + descontoIprf );
    System.out.println("Seu desconto de INSS é de R$" + descontoInss);
    System.out.println("Seu desconto para o sindicato é de R$" + descontoSindicato);
    System.out.println("Seu salário líquido é R$" + liquido);
    System.out.println("O valor descontado de seu salário bruto é de R$" + descontoTotal);

    }
}
