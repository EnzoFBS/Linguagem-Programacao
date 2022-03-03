
package com.mycompany.licaoatividade1;

import java.util.Scanner;


public class Exercicio4 {
    
    public static void main(String[] args) {
        
        Scanner LeitorNumero = new Scanner(System.in);
        
        System.out.println("Insira o valor do produto");
        
         Double valorProduto = LeitorNumero.nextDouble();
         
         System.out.println("Insira a quantidade vendida");
         
         Integer quantidadeVendida = LeitorNumero.nextInt();
         
         System.out.println("Valor pago pelo cliente");
         
         Double valorPago = LeitorNumero.nextDouble();
         
         
         Double valorTotal = (valorProduto) * quantidadeVendida;
         
         Double troco = valorPago - valorTotal; 
         
         System.out.println(String.format("Seu troco sera de %.2f",troco));
         
         
        
    }
    
}
