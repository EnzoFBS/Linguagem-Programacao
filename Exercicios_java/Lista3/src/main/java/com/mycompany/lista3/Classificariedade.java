
package com.mycompany.lista3;

import java.util.Scanner;

public class Classificariedade {
    
    public static void main(String[] args) {
        
        AppPrincipal classifi = new AppPrincipal();
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite sua idade");
        Integer IdadeUser = leitor.nextInt();
        
        
        
        classifi.classificacao(IdadeUser);
        
        
        
    }
    
}
