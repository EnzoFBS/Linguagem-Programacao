package com.mycompany.lista3;

import java.util.Scanner;

public class verificarPrimo {

    public static void main(String[] args) {

        Scanner leitorNumero = new Scanner(System.in);
        AppPrincipal verificador = new AppPrincipal();

        System.out.println("Digite um numero");
        Integer nDigitado = leitorNumero.nextInt();

        while (nDigitado > 0) {
            
            verificador.verificacaoPrimo(nDigitado);
            System.out.println("Digite um numero");
            nDigitado = leitorNumero.nextInt();

        }

    }

}
