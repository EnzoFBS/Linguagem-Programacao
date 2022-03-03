package com.mycompany.projeto.biblia;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class BibliaMain {

    public static void main(String[] args) {

        Scanner leitorString = new Scanner(System.in);
        Scanner leitorNumber = new Scanner(System.in);
        App lerBibliaCatolica = new App();
        App lerBibliaEvangelica = new App();
        App promessaFeliz = new App();
        App promessaTriste = new App();
        App promessaAnsiosa = new App();
        App promessaMedo = new App();
        App linha = new App();

        Boolean loopingMenu = true;

        System.out.println("Digite seu nome");
        String nomeUser = leitorString.nextLine();
        linha.exibeLinha();

        Double saldoUser = 0.00;

        while (loopingMenu) {

            System.out.println(String.format("Olá,%s Seja bem vindo!"
                    + " A casa da biblia \n", nomeUser));
            System.out.println(" Opção 1 -  Calculadora de Dias para ler a"
                    + " Bíblia");
            System.out.println(" Opção 2 -  Faça uma compra");
            System.out.println(" Opção 3 - Promessa de DEUS para sua vida");
            System.out.println(" Opção 4 - Sair");
            System.out.println(" Opção 5 - O show do Biblião");

            Integer opcaoUser = leitorNumber.nextInt();

            switch (opcaoUser) {

                case 1:

                    System.out.println("Qual Biblia voce deseja ler "
                            + " catolica ou evangelica?(escreva 'catolica' ou 'evangelica')");
                    String tipoBiblia = leitorString.nextLine();

                    if (tipoBiblia.equals("catolica")) {

                        System.out.println("Insira a quantidade de dias que você"
                                + " deseja ler");
                        Integer qtdDiaLer = leitorNumber.nextInt();

                        lerBibliaCatolica.CalculoDiasBibliaCatolica(qtdDiaLer);

                    } else {

                        System.out.println("Insira a quantidade de dias que você"
                                + " deseja ler");
                        Integer qtdDiaLer = leitorNumber.nextInt();

                        lerBibliaEvangelica.CalculoDiasBibliaEvangelica(qtdDiaLer);

                    }

                    break;
                case 2:

                    if (saldoUser != 0.00) {
                        System.out.println(String.format("Bem vindo a loja da casa da Biblia,"
                                + "o seu saldo atualmente é %.2f", saldoUser));

                        linha.exibeLinha();
                        linha.exibeLinha();
                        
                        System.out.println("Qual Biblía deseja comprar(lembrando"
                                + " vem com uma mensagem bonus especialmente para você)");

                        System.out.println(" Opção 1 - O velho testamento - valor R$10000.00");
                        System.out.println(" Opção 2 - O novo testamento - valor R$50000.00");
                        System.out.println(" Opção 3 - Biblia inteira - valor R$100000.00");
                        System.out.println(" Opção 4 - Biblia Jerusalem - valor R$500000.00");
                        System.out.println(" Opção 5 - Biblia de Genebra - valor R$1000000.00");
                        Integer bibliaComprar = leitorNumber.nextInt();

                        switch (bibliaComprar) {
                            case 1:
                                if (saldoUser >= 10000.00) {
                                    
                                    System.out.println("Velho testamento comprado com sucesso");
                                    
                                    saldoUser -= 10000.00;
                                    
                                        System.out.println("Mensagem especial: \n"
                                                + "Disse-lhe Jesus: Eu sou o caminho, e a verdade e a vida;"
                                                + " ninguém vem ao Pai, senão por mim. A vida sempre nos oferece muitos caminhos,"
                                                + " mas o melhor deles é aquele em que Jesus pode nos acompanhar."
                                                + " Não procure outros meios para ir ao céu, pois o único caminho é Jesus. ");
                                         linha.exibeLinha();
        
                                    
                                }
                                else{
                                    System.out.println("Saldo Insuficiente, ganhe mais dinheiro e volte depois");
                                }
                                break;
                            case 2:
                                
                                if (saldoUser >= 50000.00) {
                                    
                                    System.out.println("Novo testamento comprado com sucesso");
                                    
                                    saldoUser -= 50000.00;
                                    
                                        System.out.println("Mensagem especial: \n"
                                                + "Disse-lhe Jesus: Tenho-vos dito isto,"
                                                + " para que em mim tenhais paz; no mundo tereis aflições, mas tende bom ânimo; eu venci o mundo.. ");
                                         linha.exibeLinha();
        
                                    
                                }
                                else{
                                    System.out.println("Saldo Insuficiente, ganhe mais dinheiro e volte depois");
                                }

                                break;
                            case 3:
                                
                                if (saldoUser >= 100000.00) {
                                    
                                    System.out.println("Biblia comprada com sucesso");
                                    
                                    saldoUser -= 100000.00;
                                    
                                        System.out.println("Mensagem especial: \n"
                                                + "Ame seus inimigos, faça o bem para aqueles que te odeiam, "
                                                + "abençoe aqueles que te amaldiçoam, reze por aqueles que te maltratam.");
                                         linha.exibeLinha();
        
                                    
                                }
                                else{
                                    System.out.println("Saldo Insuficiente, ganhe mais dinheiro e volte depois");
                                }

                                break;
                            case 4:
                                 
                                if (saldoUser >= 500000.00) {
                                    
                                    System.out.println("Biblia comprada com sucesso");
                                    
                                    saldoUser -= 500000.00;
                                    
                                        System.out.println("Mensagem especial: \n"
                                                + "Ninguém tem amor maior do que aquele"
                                                + "que dá sua vida pelos amigos");
                                         linha.exibeLinha();
        
                                    
                                }
                                else{
                                    System.out.println("Saldo Insuficiente, ganhe mais dinheiro e volte depois");
                                }

                                break;
                            case 5:
                                
                                 
                                if (saldoUser >= 1000000.00) {
                                    
                                    System.out.println("Biblia comprada com sucesso");
                                    
                                    saldoUser -= 1000000.00;
                                    
                                        System.out.println("Mensagem especial: \n"
                                                + "Jesus te ama e já provou esse amor há muito tempo, "
                                                + "por isso, sorria e sinta-se em paz noite e dia.");
                                         linha.exibeLinha();
        
                                    
                                }
                                else{
                                    System.out.println("Saldo Insuficiente, ganhe mais dinheiro e volte depois");
                                }

                                break;
                            default:
                             System.out.println("Opção inválida");
                             break;

                                
                        }


                    } else {

                        System.out.println("Infelizmente você não tem saldo pra"
                                + " pra comprar alguma coisa aqui vá jogar o"
                                + " Show do Biblião para comprar algo aqui ");

                    }

                    break;
                case 3:

                    System.out.println("Como você esta se sentindo hoje?(feliz,"
                            + "triste,ansioso,medo)");
                    linha.exibeLinha();
                    String sentimento = leitorString.nextLine();
                    linha.exibeLinha();

                    switch (sentimento) {
                        case "feliz":
                            promessaFeliz.PromessaFeliz();
                            break;
                        case "triste":
                            promessaTriste.PromessaTriste();
                            break;
                        case "ansioso":
                            promessaAnsiosa.PromessaTriste();
                            break;
                        case "medo":
                            promessaMedo.PromessaMedo();
                            break;

                        default:
                            throw new AssertionError();
                    }

                    break;
                case 4:
                    
                    saldoUser = 0.00;
                    loopingMenu = false;

                    break;
                case 5:

                    System.out.println(String.format("Bem Vindo %s ao Show do "
                            + "Biblião \n"
                            + "Você terá que responder 5 perguntas e cada pergunta que"
                            + " acertar"
                            + " você ganha uma premiação, vamos lá!!(Para responder"
                            + "coloque o numero da opção desejada)", nomeUser));
                    linha.exibeLinha();
                    linha.exibeLinha();
                    System.out.println("Pergunta numero 1 "
                            + "(valendo 10 mil reais), Qual é o nome "
                            + " da pessoa que DEUS"
                            + " enviou para o mundo,"
                            + " que morreu por nossos pecados para nos dar"
                            + "a salvação?");
                    System.out.println(" Opção 1 -  Moisés");
                    System.out.println(" Opção 2 -  Rei Davi");
                    System.out.println(" Opção 3 - Jesus Cristo");
                    System.out.println(" Opção 4 - Noé");
                    Integer resposta1 = leitorString.nextInt();

                    if (resposta1 == 3) {

                        saldoUser += 10000.00;

                    }
                    else if (resposta1 != 1 && resposta1 != 2 && resposta1 != 3 && resposta1 != 4 ) {
                        
                        System.out.println("Numero inválido, tente jogar novamente");
                         break;
                        
                    }
                    
                    else {
                        System.out.println("Não foi dessa vez você errou"
                                + "vai ler a biblia");
                        break;
                    }

                    linha.exibeLinha();
                    linha.exibeLinha();
                    System.out.println("Pergunta numero 2(valendo 50 mil reais)"
                            + ",Onde está localizada essa passagem?"
                            + " Porque Deus amou o mundo de tal maneira que"
                            + " deu o seu Filho unigênito, "
                            + " para que todo aquele que nele crê não pereça,"
                            + " mas tenha a vida eterna.\n");

                    System.out.println(" Opção 1 - Jó 38:1");
                    System.out.println(" Opção 2 - Felipenses 4:6");
                    System.out.println(" Opção 3 - João 8:32");
                    System.out.println(" Opção 4 - João 3:16");
                    Integer resposta2 = leitorNumber.nextInt();

                    if (resposta2 == 4) {

                        saldoUser += 50000.00;

                    }
                    else if (resposta2 != 1 && resposta2 != 2 && resposta2 != 3 && resposta2 != 4 ) {
                        
                        System.out.println("Numero inválido, tente jogar novamente");
                         break;
                        
                    }
                    
                    else {
                        System.out.println("Não foi dessa vez você errou"
                                + " vai ler a biblia");
                        break;
                    }

                    linha.exibeLinha();
                    linha.exibeLinha();
                    System.out.println("Pergunta numero 3(valendo 100 mil reais)Qual nome da pessoa que Jesus ressucitou"
                            + " depois de quatro dias que ela morreu?");

                    System.out.println(" Opção 1 - Lázaro");
                    System.out.println(" Opção 2 - Tadeu");
                    System.out.println(" Opção 3 - Pedro");
                    System.out.println(" Opção 4 - Lucas");
                    Integer resposta3 = leitorNumber.nextInt();

                    if (resposta3 == 1) {

                        saldoUser += 100000.00;

                    }
                    else if (resposta3 != 1 && resposta3 != 2 && resposta3 != 3 && resposta3 != 4 ) {
                        
                        System.out.println("Numero inválido, tente jogar novamente");
                         break;
                        
                    }
                    
                    else {
                        System.out.println("Não foi dessa vez você errou"
                                + " vai ler a biblia");
                        break;
                    }

                    linha.exibeLinha();
                    linha.exibeLinha();
                    System.out.println("Pergunta numero 4(valendo 500 mil reais)"
                            + " Quem disse isso?"
                            + " Vinde a mim, todos os que estais cansados e oprimidos"
                            + " , e eu vos aliviarei Tomai sobre vós o meu jugo,"
                            + " e aprendei de mim, que sou manso e humilde de coração"
                            + " e encontrareis descanso para as vossas almas");

                    System.out.println(" Opção 1 - Jesus");
                    System.out.println(" Opção 2 - Deus Pai");
                    System.out.println(" Opção 3 - Moisés");
                    System.out.println(" Opção 4 - Buda");
                    Integer resposta4 = leitorNumber.nextInt();

                    if (resposta4 == 1) {

                        saldoUser += 500000.00;

                    }
                    else if (resposta4 != 1 && resposta4 != 2 && resposta4 != 3 && resposta4 != 4 ) {
                        
                        System.out.println("Numero inválido, tente jogar novamente");
                         break;
                        
                    }
                    
                    else {
                        System.out.println("Não foi dessa vez você errou"
                                + " vai ler a biblia");
                        break;
                    }
                    linha.exibeLinha();
                    linha.exibeLinha();
                    System.out.println("Pergunta do milhão(valendo 1 milhão)"
                            + " Quantos Milagres Jesus realizou em toda a biblia?");

                    System.out.println(" Opção 1 - 15");
                    System.out.println(" Opção 2 - 55");
                    System.out.println(" Opção 3 - 35");
                    System.out.println(" Opção 4 - 105");
                    Integer resposta5 = leitorNumber.nextInt();

                    if (resposta5 == 3) {

                        saldoUser += 500000.00;

                        System.out.println(String.format("Seu saldo total é R$%.2f", saldoUser));

                    }
                    else if (resposta5 != 1 && resposta5 != 2 && resposta5 != 3 && resposta5 != 4 ) {
                        
                        System.out.println("Numero inválido, tente jogar novamente");
                         break;
                        
                    }
                    
                    else {
                        System.out.println("Não foi dessa vez você errou"
                                + " vai ler a biblia");
                        break;
                    }

                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }

    }

}
