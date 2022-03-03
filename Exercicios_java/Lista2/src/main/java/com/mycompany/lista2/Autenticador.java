
package com.mycompany.lista2;

import java.util.Scanner;

public class Autenticador {
    
    public static void main(String[] args) {
       
            Scanner leitorString = new Scanner(System.in);
            Scanner leitorNumero = new Scanner(System.in);
            App banana = new App();
            
            System.out.println("Digite seu login ");
            String login = leitorString.nextLine();
            
            System.out.println("Digite sua senha");
            String senha = leitorString.nextLine();
            
            
            banana.autenticador(login, senha);
            
            
            

            
    }
    
}
