
package com.mycompany.licaoatividade1;

import java.util.Scanner;


public class CadastroUsuario {
    
    public static void main(String[] args) {
        
        Scanner leitorNumero = new Scanner(System.in);
        Scanner leitorLetra = new Scanner(System.in);
        
          System.out.println("Insira seu Login");
        String login = leitorLetra.nextLine();
      
        
         System.out.println("Insira sua senha");
        String senha = leitorLetra.nextLine();
       
        
        System.out.println("Quantas tentativas desejas?");
        Integer tentativas = leitorNumero.nextInt();
        
        
        System.out.println(String.format("Seu login é %s sua senha é %s e a quantidade de tentativas é %d",
                login,senha,tentativas));
        
        
        
        
        
        
                
                
        
        
    }
    
}
