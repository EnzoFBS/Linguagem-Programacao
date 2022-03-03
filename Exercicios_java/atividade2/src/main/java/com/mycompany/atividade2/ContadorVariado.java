 
package com.mycompany.atividade2;


public class ContadorVariado {
    
    public static void main(String[] args) {
        
        
        Double soma = 0.00;
        
      
        
        for (Double i = soma; i< 5.00; i = i + 0.15) {
            
            soma = soma + i;
            
            System.out.println(String.format("%.2f", i));
            
        }
        
    }
    
}
