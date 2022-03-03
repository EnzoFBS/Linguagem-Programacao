package com.mycompany.licaoatividade1;

import java.util.Scanner;

public class Elevado_exc6 {

    public static void main(String[] args) {

        Scanner leitorNumero = new Scanner(System.in);

        System.out.println("Insira o limite de peso de um elevador");

        Double limitePeso = leitorNumero.nextDouble();

        System.out.println("Insira o limite de pessoas elevador");

        Integer limitePessoas = leitorNumero.nextInt();

        System.out.println("Insira o peso da 1 pessoa");
        
         Double Peso1 = leitorNumero.nextDouble();

        System.out.println("Insira o peso da 2 pessoa");
        
         Double Peso2 = leitorNumero.nextDouble();

        System.out.println("Insira o peso da 3 pessoa");
        
         Double Peso3 = leitorNumero.nextDouble();
         
         Double somaPesos = Peso1 + Peso2 + Peso1;
         
         
         System.out.println(String.format("Entraram 3 pessoas no elevador, no qual cabem %d pessoas" +
"O peso total no elevador é de %.2f , sendo que ele suporta %.2f",limitePessoas,somaPesos,limitePeso));
         

    }

}
