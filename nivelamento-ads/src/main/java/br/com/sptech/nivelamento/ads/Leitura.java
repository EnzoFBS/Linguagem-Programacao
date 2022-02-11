
package br.com.sptech.nivelamento.ads;

import java.util.Scanner;


public class Leitura {
    
    /* Input de dados pro console */
    
    public static void main(String[] args) {
        
        System.out.println("Digite seu nome");
        
           Scanner leitorNumeros = new Scanner(System.in);
           Scanner leitorLetras = new Scanner(System.in);
           String nomeDigitado = leitorLetras.nextLine();
           
           System.out.println("Olá, "+ nomeDigitado);
           
           System.out.println("Digite sua idade");
           
           Integer idadeDigitada = leitorNumeros.nextInt();
           
           System.out.println("Sua idade  " + idadeDigitada);
           
           
           System.out.println("Seu nome é " + nomeDigitado + " Sua idade é "+
            idadeDigitada );
           
  
           Double altura = leitorNumeros.nextDouble();
           
           System.out.println("A altura digitada foi: " + altura);
           
    }
    
   
      
     
     
    
}
