package com.mycompany.projeto.teste;

import java.util.concurrent.ThreadLocalRandom;

public class App {

    void exibeLinha() {

        System.out.println("---------------------------------------------------"
                + "--------");

    }

    void CalculoDiasBibliaCatolica(Integer qtdDiasLer) {

        Double qtdPaginasBiblia = 1300.00;

        Double mediaParaLer = qtdPaginasBiblia / qtdDiasLer;

        System.out.println(String.format("Para você ler a bíblia em %d dias"
      + " você necessita ler %.2f páginas por dia", qtdDiasLer, mediaParaLer));

    }

    void CalculoDiasBibliaEvangelica(Integer qtdDiasLer) {

        Double qtdPaginasBiblia = 1100.00;

        Double mediaParaLer = qtdPaginasBiblia / qtdDiasLer;

        System.out.println(String.format("Para você ler a bíblia em %d dias"
        + " você necessita ler %.2f páginas por dia", qtdDiasLer, mediaParaLer));

    }

    void PromessaFeliz() {

        Integer nSorteado = ThreadLocalRandom.current().nextInt(1, 4);

        if (nSorteado == 1) {
            System.out.println("Tu, Senhor, guardarás em perfeita paz aquele"
                    + " cujo propósito está firme,porque em ti confia(Isaias 26:3)");

        } else if (nSorteado == 2) {
            System.out.println("Jesus respondeu:O que é impossível para os"
                    + " homens é possível para Deus(Lucas 18:27)");
        } else {
            System.out.println("O Senhor Deus é sol e escudo o Senhor concede favor e"
                    + " honra;não recusa nenhum bem a os que vivem com integridade(Salmos 84;11).");
        }

    }

    void PromessaTriste() {

        Integer nSorteado = ThreadLocalRandom.current().nextInt(1, 4);

        if (nSorteado == 1) {
            System.out.println("Ele enxugará dos seus olhos toda lágrima. Não haverá mais morte, nem tristeza,"
                    + " nem choro, nem dor, pois a antiga ordem já passou(apocalipse 21:4)");

        } else if (nSorteado == 2) {
            System.out.println("Disse-lhe Jesus: Eu sou a ressurreição "
                    + "e a vida; quem crê em mim, "
                    + "ainda que esteja morto, viverá; e todo aquele que vive "
                    + "e crê em mim nunca morrerá(joao 25:11)");
        } else {
            System.out.println("O que vencer será vestido de vestes brancas,"
                    + " e de maneira nenhuma riscarei o seu nome do livro da vida;"
                    + " e confessarei o seu nome diante de"
                    + " meu Pai e diante dos seus anjos(apocalipse 3:5)");
        }

    }

    void PromessaMedo() {

        Integer nSorteado = ThreadLocalRandom.current().nextInt(1, 4);

        if (nSorteado == 1) {
            System.out.println("nenhum mal o atingirá, desgraça"
                    + " alguma chegará à sua tenda(Salmos 91:10)");

        } else if (nSorteado == 2) {
            System.out.println("Busquei o Senhor, e ele me respondeu; livrou-me"
                    + " de todos os meus temores(Salmos 34:4)");
        } else {
            System.out.println("Quando passares pelas águas,estarei contigo, "
                    + "e, quando pelos rios, eles não te submergirão;  passares pelo fogo,"
                    + " não te queimarás, nem a chama arderá em ti(Isaias 43:2)");
        }

    }

    void PromessaAnsiosa() {
        Integer nSorteado = ThreadLocalRandom.current().nextInt(1, 4);

        if (nSorteado == 1) {
            System.out.println("Não andem ansiosos por coisa alguma, mas em tudo, pela oração"
                    + " e súplicas, e com ação de graças, apresentem"
                    + " seus pedidos a Deus.(felipenses 4:6)");

        } else if (nSorteado == 2) {
            System.out.println("Por isso, vos digo: não andeis ansiosos"
                    + " pela vossa vida, quanto "
                    + "ao que haveis de comer ou beber nem pelo vosso corpo,"
                    + " quanto ao que haveis"
                    + " de vestir.Não é a vida mais do que o"
                    + " alimento, e o corpo, mais do que as vestes?"+
         "Buscai, pois, em primeiro lugar, o reino de Deus e a sua justiça, e"
                    + " todas estas coisas vos serão acrescentadas(Mateus 6:25)");
        } else {
            System.out.println("Porque eu bem sei os pensamentos que tenho"
                    + " a vosso respeito, diz o Senhor; pensamentos de paz,"
                    + " e não de mal, para vos dar o fim que esperais.” Jeremias 29:11.");
        }
        

        
    }

}
