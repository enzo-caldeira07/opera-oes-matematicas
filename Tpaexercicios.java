/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tpaexercicios;

/**
 *
 * @author Vitor
 */
//inicio exercicio 1 
import java.util.Scanner;
     
public class Tpaexercicios {
    public static void main(String[] args) {
   Scanner scanner = new Scanner (System.in);     
    
   System.out.print("digite o primeiro numero:");
   double n1 = scanner.nextDouble();
   
   System.out.print("digite o segundo numero:");
   double n2 = scanner.nextDouble();
   
   double soma = n1 + n2;
   double subtracao = n1 - n2;
   double multiplicacao = n1 * n2;
   double divisao = n1 / n2;
   
   System.out.println("soma:" + soma);
   System.out.println("subtração:" + subtracao);
   System.out.println("multiplicaçao:" + multiplicacao);
   System.out.println("divisão:" + divisao);           
  //fim do exercicio 1         
  // inicio exercicio 2 
  
  System.out.print("digite os graus celsius");
   double celsius = scanner.nextDouble();
   
   double  fahrenheit = celsius * 1.8 + 32;
   double kelvin = celsius + 237.15;
   System.out.println("o numero em  fahrenheit e:" +  fahrenheit);
   System.out.println("o numero em kelvin e:" + kelvin);
   //fim exercicio 2 
   //inicio exercicio 3 
   
   System.out.print("digite um numero inteiro:");
   int numero = scanner.nextInt();
   
   boolean eprimo = true;
   
   if (numero <= 1) {
            eprimo = false; // Números menores ou iguais a 1 não são primos
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    eprimo = false; // Encontrou um divisor, não é primo
                    break;     
        
        
                }
            }
   }
   
   if (eprimo) {
       System.out.println("o numero" + numero + "e primo");
   } else {
       System.out.println("o numero" + numero + "nao e primo");
   }
          //fim exercicio 3 
    }
    }

