
package com.mycompany.licaoatividade1;

import java.util.Scanner;


public class Exercicio1 {
    
    public static void main(String[] args) {
        
        Scanner leitorNumeros = new Scanner(System.in);
        Scanner leitorLetras = new  Scanner(System.in);
        
        
        
        
        System.out.println("Digite a quantidade de filhos de 0 a 3 ");
        
        
       Integer filhos_bebe = leitorNumeros.nextInt();
       
      
       
       
        System.out.println("Digite a quantidade de filhos de 4 a 16 ");
        
       Integer filhos_Crianca = leitorNumeros.nextInt();
       
       
        System.out.println("Digite a quantidade de filhos de 17 e 18 ");
         
       Integer adolescente = leitorNumeros.nextInt();
       
        Double valorBolsa = (filhos_bebe*25.12) + (filhos_Crianca*15.88)+
                (adolescente *12.44);
        
        Integer totalf = filhos_bebe + filhos_Crianca + adolescente;
       
       
       
        System.out.println(String.format("Você tem um total de %d filhos e vai receber R$ %.2f",totalf,
               valorBolsa));
        
        

     
        
        
        
        
        
        System.out.println("");
        
    }
    
}
