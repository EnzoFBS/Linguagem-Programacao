
package com.mycompany.atividade2;

import java.util.Scanner;


public class Tabuada {
    
    public static void main(String[] args) {
              Scanner leitor = new Scanner(System.in);
              
        System.out.println("Insira um numero");
        Integer numInserido = leitor.nextInt();
        
        for (int i = 0; i <= 10; i++) {
            
            System.out.println("tabuada do " + numInserido +" "+ "= "+ numInserido * i);
            
        }
        
        
    }
    
}
