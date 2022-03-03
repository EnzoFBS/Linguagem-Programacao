
package com.mycompany.lista2;

import java.util.Scanner;


public class CalcularPeso {
   
    public static void main(String[] args) {
    Scanner leitorString = new Scanner(System.in);
    Scanner leitorNumber = new Scanner(System.in);
    App imc = new App ();
    
        System.out.println("Digite seu genero");
        System.out.println("Opção 1 - M(MASCULINO)");
        System.out.println("Opção 2 - F(FEMININO)");
        Integer generoUser = leitorNumber.nextInt();
     
        
        System.out.println("Digite também sua Altura");
        Double alturaUser = leitorNumber.nextDouble();
        
        
        imc.calculaImc(generoUser, alturaUser);
     



    
    }
    
    
    
   
    
}
