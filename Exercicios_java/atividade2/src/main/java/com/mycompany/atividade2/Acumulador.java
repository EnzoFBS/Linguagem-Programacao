
package com.mycompany.atividade2;

import java.util.Scanner;

public class Acumulador {
    
    public static void main(String[] args) {
        
         Scanner leitor = new Scanner(System.in);
         
         System.out.println("Digite um numero");
         Integer numDigitado = leitor.nextInt();
         
         Integer soma = 0;
         
         while (numDigitado!=0) {
             
             soma = numDigitado + soma;
             System.out.println("Errou o numero");
             numDigitado = leitor.nextInt();
            
        }
         
         System.out.println(soma);
    }
    
}
