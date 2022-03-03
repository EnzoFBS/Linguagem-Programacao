/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3;

/**
 *
 * @author PICHAU
 */
public class App {
    
    double mediaAlunao( Double nota1,Double nota2){
    
        Double media = nota1 * 0.4 + nota2 * 0.6;
        
      System.out.println(String.format("A média do aluno é %.2f", media));
      
      return media;
    
    }
    
}
