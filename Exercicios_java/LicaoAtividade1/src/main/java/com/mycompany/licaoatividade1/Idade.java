

package com.mycompany.licaoatividade1;

import java.util.Scanner;



public class Idade {

    public static void main(String[] args) {
        
        Scanner leitorLetra = new Scanner(System.in);
         Scanner leitorNumero = new Scanner(System.in);
         
         System.out.println("Digite seu nome");
         String nome = leitorLetra.nextLine();
         
         System.out.println(String.format("Olá %s! Qual seu ano de nascimento?",nome));
         Integer nascimento = leitorNumero.nextInt();
         
         Integer idade = 2030 - nascimento;
         
         System.out.println("Em 2030 voce terá " + idade + " anos");
        
            
        
    }
    
}
