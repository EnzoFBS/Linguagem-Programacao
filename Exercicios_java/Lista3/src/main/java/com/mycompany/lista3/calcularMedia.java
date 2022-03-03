
package com.mycompany.lista3;

import java.util.Scanner;



public class calcularMedia {

    public static void main(String[] args) {
        
        App calc = new  App();
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite suas 2 notas");
        Double nota1 = leitor.nextDouble();
        Double nota2 = leitor.nextDouble();
        
        
        
        calc.mediaAlunao(nota1, nota2);
        
    }
    
}
