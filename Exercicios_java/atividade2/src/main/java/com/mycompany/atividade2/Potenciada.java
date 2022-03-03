
package com.mycompany.atividade2;

import java.util.Scanner;


public class Potenciada {
    
    public static void main(String[] args) {
        
            Scanner leitor = new Scanner(System.in);
            
            System.out.println("Insira a base desejada");
            Integer numBase = leitor.nextInt();
            
            System.out.println("Insira a potência desejada");
            Integer numPotencia = leitor.nextInt();
            
           Integer base = numBase;
            
          Integer multiplicador = base;
             
            
            for (int i = 1; i < numPotencia; i++) {
                
               multiplicador = multiplicador * base;
                
            
        }
            
            System.out.println(multiplicador);
            System.out.println(Math.pow(numBase, numPotencia));                
        
    }
    
}
