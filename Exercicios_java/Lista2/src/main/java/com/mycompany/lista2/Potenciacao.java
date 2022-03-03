
package com.mycompany.lista2;

import java.util.Scanner;

public class Potenciacao {
    
    public static void main(String[] args) {
            Scanner leitorNumero = new Scanner(System.in);
            App banana = new App();
            
            System.out.println("Digite a base de um numero");
            Integer base = leitorNumero.nextInt();
            
            System.out.println("Digite o expoente de um numero");
            Integer expo = leitorNumero.nextInt();
            
            
            
            
         Integer abacaxi = banana.pontecianenem(base, expo);
         
            
    //     Integer resultado = base;
           
           
       // for (int i = 1; i < expo; i++) {
               
      //      resultado = resultado * base;
            
 //   }
           
           System.out.println(String.format("o seu resultado é %d", abacaxi));
            System.out.println(Math.pow(base, expo));
            
    }
    
}
