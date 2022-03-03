
package com.mycompany.licaoatividade1;

import java.util.Scanner;

public class CalculoMedia {
    
    public static void main(String[] args) {
        
        Scanner leitorNumero = new Scanner(System.in);
         Scanner leitorLetra = new Scanner(System.in);
         
         System.out.println("Insira seu nome");
         String nomeUsuario = leitorLetra.nextLine();
         
         System.out.println("Insira sua primeira nota");
         Double nota1 = leitorNumero.nextDouble();
         
          System.out.println("Insira sua segunda nota");
         Double nota2 = leitorNumero.nextDouble();
         
         Double media = (nota1 + nota2)/2;
         
         
         System.out.println(String.format("Olá,%s. Sua média foi %.2f",nomeUsuario,media));
         
         
        
        
    }
    
}
