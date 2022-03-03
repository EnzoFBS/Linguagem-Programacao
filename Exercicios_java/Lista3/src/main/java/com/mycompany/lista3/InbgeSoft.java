
package com.mycompany.lista3;

import java.util.Scanner;


public class InbgeSoft {
    
    public static void main(String[] args) {
    
        Scanner leitor = new Scanner(System.in);
        AppPrincipal salarios = new AppPrincipal();
        AppPrincipal classi = new AppPrincipal();
        
        System.out.println("Insira sua renda mensal");
        Double rendaUsuario = leitor.nextDouble();
        
        Double qtdSalarios = salarios.Slminimo(rendaUsuario);
        
        String classeAtual = classi.ClasseSocial(rendaUsuario);
        
        
        System.out.println(String.format("Você recebe aproximadamente %.2f salários minimos",qtdSalarios));
        System.out.println(String.format("Você pertence a classe social %s",classeAtual));
        
        
    }
    
    
    
    
}
