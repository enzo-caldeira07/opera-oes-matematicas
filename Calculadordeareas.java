/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.calculadordeareas;

/**
 *
 * @author FATEC ZONA LESTE
 */

public class Calculadordeareas {
    public static void main(String[] args) {
    //definaçao de dois numeros
double num1 = 10.5;
double num2 = 5.2;

//realizando operacoes matematicas
double soma = num1 + num2;
double subtracao = num1 - num2;
double multiplicacao = num1 * num2;
double divisao = num2 !=0 ? num1 / num2 : Double.NaN;
double resto = num1 % num2;

//exibindo os resultados
System.out.println("resultados das operaçoes");
System.out.println("soma:" + soma);
System.out.println("subtraçao:" + subtracao);
System.out.println("multiplicaçao:"+ multiplicacao);
System.out.println("divisão: " + (num2 != 0 ? divisao : "indefinida (divisão por zero)"));
System.out.println("reato de divisão:" + resto);



    }
    
}
