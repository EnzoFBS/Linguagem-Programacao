
package com.mycompany.lista3;

public class calculaPesoIdeal {

    void calcImc(String genero,double altura){
        
            Double CalcularImcHomem = (72.7 * altura) - 58;
            Double calcImcFemea = (62.1 * altura) - 44.7; 
            
            
            if (genero.equals("m")) {
                
                System.out.println(String.format("O seu peso ideal é %.2f", CalcularImcHomem));
            
        }
            else if (genero.equals("f")) {
                
                 System.out.println(String.format("O seu peso ideal é %.2f", calcImcFemea));
            
        }
            else{
            
                System.out.println("Digitou errado");
                
            }
            
         
    
    
    }
    
}
