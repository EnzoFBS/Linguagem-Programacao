
package br.com.sptech.nivelamento.ads;

import java.util.Scanner;

public class PassagemMetro {

    public static void main(String[] args) {
        
        System.err.println("Digite seu nome");
        Scanner leitorNome = new Scanner(System.in);
        
        String nome = leitorNome.nextLine();
        Double saldo = 250.00;
        Double quantidades = 250/4.40;
        
        System.out.println(String.format("%s Voce pode usar metro %d vezes",nome,quantidades.intValue()));
            
    }
    
}
