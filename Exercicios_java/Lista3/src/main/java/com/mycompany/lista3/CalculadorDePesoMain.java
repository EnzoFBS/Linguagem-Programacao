
package com.mycompany.lista3;

import java.util.Scanner;


public class CalculadorDePesoMain {
    
    
    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
           Scanner leitorN = new Scanner(System.in);
           calculaPesoIdeal imc = new calculaPesoIdeal();
           
        
        System.out.println("Digite seu genero(m ou f)");
       String generoPessoa = leitor.nextLine();
       
        System.out.println("Insira sua altura");
        Double altura = leitorN.nextDouble();
        
        imc.calcImc(generoPessoa, altura);
  
        
        
    }
    
}
