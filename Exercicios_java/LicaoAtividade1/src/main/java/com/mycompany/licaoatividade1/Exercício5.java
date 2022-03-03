
package com.mycompany.licaoatividade1;

import java.util.Scanner;


public class Exercício5 {
    
    public static void main(String[] args) {
        
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.println("Insira seu salário bruto");
        Double salarioBruto = leitorNumero.nextDouble();
        
        Double descontoINSS = salarioBruto * 0.10;
        
        Double descontoIR = salarioBruto * 0.20;
        
        System.out.println("Quanto custa a condução de ida?");
        Double conducao = leitorNumero.nextDouble();
        
        Double DescontoVT = conducao * 22;
        
        Double totalDescontos = descontoINSS + DescontoVT + descontoIR;
        
        Double salarioLiquido = salarioBruto - totalDescontos;
        
        System.out.println(String.format("Seu salário bruto é R$ %.2f "
                + "tem um total de R$ %.2f em desocontos e receberá um lirquido"
                + "de %.2f",salarioBruto,totalDescontos,salarioLiquido));
        
        
        
        
    }
    
}
