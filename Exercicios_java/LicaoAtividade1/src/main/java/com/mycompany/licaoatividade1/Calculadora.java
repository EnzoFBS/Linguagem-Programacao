
package com.mycompany.licaoatividade1;

import java.util.Scanner;


public class Calculadora {
    
    public static void main(String[] args) {
        
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        
        Integer numeroDigitado1 = leitorNumero.nextInt();
        
        System.out.println("Digite outro numero");
        
         Integer numeroDigitado2 = leitorNumero.nextInt();
         
         Integer soma = numeroDigitado1 + numeroDigitado2;
         
         System.out.println("a soma é " + soma);
       
         
         
         Integer subtracao = numeroDigitado1 - numeroDigitado2;
         
         System.out.println("a subtracao é " + subtracao);
         
         Integer multiplacao = numeroDigitado1 * numeroDigitado2;
         
         System.out.println("a multiplicação é " + multiplacao);
         
         
         Integer divisao = numeroDigitado1 / numeroDigitado2;
         
         System.out.println("a Divisão é " + divisao);
         
        
    }
    
}
