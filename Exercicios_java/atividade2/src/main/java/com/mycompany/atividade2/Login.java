
package com.mycompany.atividade2;

import java.util.Scanner;

public class Login {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira seu login");
        String nome = leitor.nextLine();
        System.out.println("Insira sua senha");
        String senha = leitor.nextLine();
        
        while (!nome.equals("admin") || !senha.equals("senha") ) {

            System.out.println("Login Inválido , digite novamente");
             System.out.println("Insira seu login");
             nome = leitor.nextLine();
             System.out.println("Insira sua senha");
             senha = leitor.nextLine();
            
            
            
        }
        
        System.out.println("Login efetuado com sucesso");
        
    }
    
}
