/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacoesmatematicas2;

/**
 *
 * @author Enzo caldeira cavalcante
 */
public class Operacoesmatematicas2 {

    public static void main(String[] args) {
     //valores das variaveis do triangulo
     double basetriangulo = 8.5;
     double alturatriangulo = 6.2;
     //variaveis do quadrado
     double ladoquadrado = 9.4;
     // variaveis do retangulo
     double baseretangulo = 12.6;
     double ladoretangulo = 5.4;
     // variaveis losango
     double diagonalmaior = 14.8;
     double diagonalmenor = 9.2;        
    // variaveis circuferencia
    double raio = 5.0;
    //numeros para operaçoes matematicas
    double num1 = 15.5;
    double num2 = 20;
    // calculando as variaveis 
    double areatriangulo = basetriangulo * alturatriangulo /2;
    double areaquadrado = ladoquadrado * Math.pow(9.4, 2);
    double arearetangulo = baseretangulo * ladoretangulo;
    double arealosango = diagonalmaior * diagonalmenor /2;
    double areadacircuferencia = Math.PI * Math.pow(raio ,2);
    double soma = num1 + num2;
    double subtracao = num1 - num2;
    double multiplicacao = num1 * num2;
    double divisao = num2 !=0 ? num1 / num2 : Double.NaN;
     double media = num1 + num2 /2;  
    //exibindo os resultados
    System.out.println("area do triangulo" + areatriangulo);
    System.out.println("area do quadrado" + areaquadrado);
    System.out.println("area do retangulo" + arearetangulo);
    System.out.println("area do losango" + arealosango);
    System.out.println("area da circuferencia" + areadacircuferencia);
    System.out.println("resultados das operaçoes");
    System.out.println("soma:" + soma);
    System.out.println("subtraçao:" + subtracao);
    System.out.println("multiplicaçao:"+ multiplicacao);
    System.out.println("divisão: " + (num2 != 0 ? divisao : "indefinida (divisão por zero)"));
    System.out.println("média" + media);
    
    
    }
    
}
  


