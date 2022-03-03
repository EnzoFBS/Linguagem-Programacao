
package com.mycompany.licaoatividade1;

import java.util.Scanner;


public class Execicio3 {
    
    public static void main(String[] args) {
        
        Scanner leitorNumeros = new Scanner(System.in);
        
        System.out.println("Quantos minutos passou se aquecendo?");
        Integer aquecimento = leitorNumeros.nextInt();
        
          System.out.println("Quantos minutos passou fazendo aerobico?");
          Integer aerobico = leitorNumeros.nextInt();
          
             System.out.println("Quantos minutos passou fazendo musculação?");
          Integer musculacao = leitorNumeros.nextInt();
          
          
          Integer caloriasTotais = (aquecimento*12) + (aerobico*20) + 
                  (musculacao*25);
          
          Integer tempoTotal = aquecimento + aerobico + musculacao;
          
          System.out.println(String.format("Olá Jorge, voce fez um total de %d minutos de exc e perdeu %d calorias",tempoTotal,caloriasTotais));
          
            
          
          
          
        
        
        
    }
    
}
