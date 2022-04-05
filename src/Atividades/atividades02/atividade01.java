package Atividades.atividades02;

import java.util.Random;
import java.util.Scanner;

public class atividade01 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int num = new Random().nextInt(11);
        Scanner in = new Scanner(System.in);
        int recebe;
        int contador =1;

        System.out.println("Bem vind@ ao jogo da adivinhacao\n"
                + "Para vencer adivinhe o numero, ele estão entre os números 0 e 10, incluindo as extremidades.");

        System.out.printf("Digite um valor: ");

        recebe = in.nextInt();
        while(recebe != num) {
            if(recebe > num) {
                System.out.println("O numero a ser adivinhado eh menor que o numero chutado");
            }else
                System.out.println("O numero a ser adivinhado eh maior que o numero chutado");

            System.out.println("Chute um valor diferente do palpite anterior");
            recebe = in.nextInt();
            contador++;
        }

        System.out.println("Voce adivinhou o numero apos "+ contador+" tentativas!");

        in.close();
    }
}
