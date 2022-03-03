
package com.mycompany.lista2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Loteria {
    
    public static void main(String[] args) {
        
        Scanner leitorNumero = new Scanner(System.in);
      
        
        System.out.println("Digite um numero entre 0 e 10");
        Integer nDigitado = leitorNumero.nextInt();
          Integer nSorteado =   ThreadLocalRandom.current().nextInt(0,11);
   
     
     Integer contador = 0;
        while (nSorteado != nDigitado ) {

            System.out.println(String.format("O numero sorteado foi %d", nSorteado));
            System.out.println("Digite novamente um numero");
            nDigitado = leitorNumero.nextInt();
            nSorteado =   ThreadLocalRandom.current().nextInt(0,11);
            contador++;
        }
        
        System.out.println(String.format("voce acertou o numero %d",nDigitado));
        
        if (contador <= 3) {
            System.out.println("tem sort em");
        }
        else if (contador <=10) {
            
            System.out.println("sorte media");
        
        
        }
        else{
        
            System.out.println("azar");
            
        }
     
     
    }
    
}
