
package com.mycompany.lista3;

import java.util.Scanner;


public class DescontoProgressivo {


    public static void main(String[] args) {
        
        AppPrincipal descontao = new AppPrincipal();
        AppPrincipal apareceTudo = new AppPrincipal();
        Scanner leitor = new Scanner(System.in);
        
        
        
        System.out.println("Digite o valor unitário do produto");
        Double valorUnitario = leitor.nextDouble();
        
        System.out.println("Digite a quantidade");
        Integer qtdProduto = leitor.nextInt();
        
        Double descontoDeTudo = descontao.DescontoProgressivo(valorUnitario, qtdProduto);
        
     apareceTudo.notaFiscal(valorUnitario, qtdProduto, descontoDeTudo);
        
        
     /*
       System.out.println(String.format("Valor do Produto: R$ %.2f \n"
               + "quantidade: %d \n"
               + "--------------------------------------\n"
               + "Valor com desconto: R$ %.2f",alorUnitario,qtdProduto,descontoDeTudo));;
       */
        

    }
            
    
}
