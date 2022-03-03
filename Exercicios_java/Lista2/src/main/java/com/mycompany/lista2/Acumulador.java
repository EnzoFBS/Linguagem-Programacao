/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2;

import java.util.Scanner;


public class Acumulador {
    
 
     
     
     public static void main(String[] args) {
            Scanner leitorNumero = new Scanner(System.in);
            App abacaxi = new App();
         System.out.println("Digite um n");
         Integer nDigitado = leitorNumero.nextInt();
         
         
         Integer valorTotal = abacaxi.somao(nDigitado);
         
      //   Integer valorTotal = nDigitado;
         
      //   while (nDigitado != 0) {
      //      System.out.println("Digite novamente");
       //      nDigitado = leitorNumero.nextInt();
      //       valorTotal = valorTotal + nDigitado;
             
        // }
         
         System.out.println(String.format("A soma dos valores é %d", valorTotal));
         
         
    }
      
    
}
