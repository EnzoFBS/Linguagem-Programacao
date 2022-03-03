package com.mycompany.atividade2;

import java.util.Scanner;

public class Pizza {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Integer vt_mussarela = 0;
        Integer vt_quatroqueijos = 0;
        Integer vt_calabresa = 0;

        Integer melhorPizza = 0;

        for (int i = 0; i <= 10; i++) {

            System.out.println("Vote na sua pizza favorita");
            Integer pizzaDigitada = leitor.nextInt();

            switch (pizzaDigitada) {
                case 5:
                    vt_mussarela++;
                    break;
                case 25:
                     vt_calabresa++;
                    break;
                case 50:
                        vt_quatroqueijos++;
                    break;
            }

        }

        System.out.println(String.format("Foram %d votos para pizza de mussarela"
                + "e %d votos para pizza de quatro queijos"
                + "e por fim %d votos para pizza de calabresa", vt_mussarela, vt_quatroqueijos,
                 vt_calabresa));

        if (vt_mussarela > vt_calabresa && vt_mussarela > vt_quatroqueijos) {
            System.out.println("A pizza favorita é de mussarela");
        } else if (vt_calabresa > vt_mussarela && vt_calabresa > vt_quatroqueijos) {

            System.out.println("A pizza favorita é de calabresa");
        } else {
            System.out.println("A pizza favorita é de quatro queijos");

        }

    }

}
