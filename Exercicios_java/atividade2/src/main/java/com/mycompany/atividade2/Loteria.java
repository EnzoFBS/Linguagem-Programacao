
package com.mycompany.atividade2;

import java.util.Random;
import java.util.Scanner;



public class Loteria {

    public static void main(String[] args) {
        
    Scanner leitor = new Scanner(System.in);
    Random rand = new Random();
    
        System.out.println("Digite um numero de 0 a 10");
        Integer numDigitado = leitor.nextInt();
        Integer  numeroAleatorio = rand.nextInt(10);
        Integer cont = 0;
        while (numDigitado!= numeroAleatorio) {
            
            cont++;
           
             System.out.println(String.format("Errou o numero sorteado foi %d",numeroAleatorio));
             numeroAleatorio = rand.nextInt(10);
            System.out.println("Digite um numero de 0 a 10");
            numDigitado = leitor.nextInt();
            
            
            
        }
        
        if (cont <= 3) {
            
            System.out.println("Você é MUITO sortudo");
            
        }
        else if (cont >= 4 && cont <=10) {
            
            System.out.println("voce tem sorte");
            
        }
        else{
            
            System.out.println("Para de apostar e vai trabalhar");
        }
        

    
    }
    
    
}
