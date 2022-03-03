/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2;

import java.util.Scanner;

public class App {
    
    
    void calculaImc(Integer genero, Double altura){
    
        switch (genero) {
            case 1:
              Double resultadoImcHomem = (72.7 * altura) - 58;
                System.out.println(String.format("O seu peso ideal é %.2f", resultadoImcHomem));
                break;
            case 2:
          Double resultadoImcMulher =  (62.1 * altura) - 44.7;
        System.out.println(String.format("O seu peso ideal é %.2f", resultadoImcMulher));
              break;
            default:
             System.out.println("Opção inválida, digite denovo corretamente");
          break;
        }
        
    
    
    
    }
    
    


    Integer pontecianenem(Integer base, Integer expoente){
        
    Integer resultadoTotal = base;
        for (int i = 1; i < expoente; i++) {
            
            resultadoTotal = resultadoTotal * base;
            
        }
        
        return resultadoTotal;
    
    }
    
    
        void autenticador(String user, String password){
             Scanner leitorString = new Scanner(System.in);
    
        while (!user.equals("Admim") || !password.equals("bandtec") ) {            
            System.out.println("login/senha errado!,digite novamente");
             System.out.println("Digite seu login ");
            String login = leitorString.nextLine();
            
            System.out.println("Digite sua senha");
            String senha = leitorString.nextLine();
        }
        
            System.out.println("Login efetuado com Sucesso");
    
    
    }
    
    Integer somao(Integer nDigitado){
       Scanner leitorNumero = new Scanner(System.in);
    
          
       Integer valorTotal = nDigitado;
         
         while (nDigitado != 0) {
             System.out.println("Digite novamente");
             nDigitado = leitorNumero.nextInt();
             valorTotal = valorTotal + nDigitado;
             
         }
         
         return valorTotal;
    
    
    }
    
}
