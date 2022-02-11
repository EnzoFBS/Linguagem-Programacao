package br.com.sptech.nivelamento.ads;

import java.util.Scanner;

public class Condicionais {

    public static void main(String[] args) {

        Integer numero = 42;

        // If
        Scanner leitorNumero = new Scanner(System.in);
         Scanner leitorLetras = new Scanner(System.in);
         
       

        System.out.println("Digite um numero");

        Integer numeroEsc = leitorNumero.nextInt();

        if (numero > numeroEsc) {
            System.out.println("o numero digitado foi menor");
        } else if(numero < numeroEsc) {
            System.out.println("O numero digitado foi maior ");
        }
        else{
            System.out.println("Ta tudo igual");
        }
        
        String nome1 = "Lura";
        System.err.println("Digite Lura");
        String nome2 = leitorLetras.nextLine();
        
        if (nome1.equalsIgnoreCase(nome2)) {
            
            System.out.println("igualll");
            
        }
        else{
            System.out.println("diferente");
        }
    }

}
