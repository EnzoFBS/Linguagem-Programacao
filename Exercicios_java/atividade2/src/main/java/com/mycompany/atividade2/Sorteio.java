
package com.mycompany.atividade2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    
    public static void main(String[] args) {
        
          Scanner leitor = new Scanner(System.in);
          
          System.out.println("Insira um numero de 1 a 100");
          Integer numDigitado = leitor.nextInt();
          Integer numeroGerado = ThreadLocalRandom.current().nextInt(1,101);
          
          
          
          Integer cont = 0;
          Integer numPar = 0;
          Integer numImpar = 0;
          Integer morreIf = 0;
      
        while (cont< 200) {    
           
            
            numeroGerado = ThreadLocalRandom.current().nextInt(1,101);
            
            if (morreIf == 0) {
                  if (numDigitado == numeroGerado) {
                  System.out.println("os numero sorteado foi " + numeroGerado);
                  morreIf++;
                }
            }
            
            if (numeroGerado % 2 == 1 ) {
                
                numImpar++;
                
            }
            else{
                numPar++;
            }
                      
            
        
             cont ++; 
            
            
          
            
        }
    
        System.out.println("Quantidade de numero impar foi " + numImpar);
        System.out.println("Quantidade de numero par foi " + numPar);
    }
    
}
