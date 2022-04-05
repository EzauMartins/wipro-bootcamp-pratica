package Atividades.atividades02;

import java.util.Scanner;

public class atividade03 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String[] nomes = new String[4];
        Integer []votos = new Integer[4];
        boolean empate =  false;
        int voto, vencedor =0;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o nome dos quatro candidatos: ");

        for(int i=0; i<4 ; i++) {
            votos[i] =0;
        }

        for(int i=0; i<4 ; i++) {
            nomes[i] = in.next();
        }

        System.out.println("Digite 1 para votar em "+ nomes[0]
                +"\nDigite 2 para votar em "+ nomes[1]
                +"\nDigite 3 para votar em "+ nomes[2]
                +"\nDigite 4 para votar em "+ nomes[3]
                +"\nDigite 0 para encerrar a votacao");

        voto = in.nextInt();
        while(voto != 0) {
            switch (voto) {
                case 1:
                    votos[0]++;
                    break;
                case 2:
                    votos[1]++;
                    break;
                case 3:
                    votos[2]++;
                    break;
                case 4:
                    votos[3]++;
                    break;
                case 0:

                    break;

                default:
                    System.out.println("Numero invalido.");
                    break;
            }
            voto = in.nextInt();
        }

        System.out.println("O candidato "+ nomes[0] +" recebeu "+ votos[0] + " votos\n"
                +"O candidato "+ nomes[1] +" recebeu "+ votos[1] + " votos\n"
                +"O candidato "+ nomes[2] +" recebeu "+ votos[2] + " votos\n"
                +"O candidato "+ nomes[3] +" recebeu "+ votos[3] + " votos\n");

        for(int i=1 ; i<4 ; i++) {
            if(votos[vencedor] < votos[i])
                vencedor =i;
        }
        for(int i=0 ; i<4; i++) {
            if(votos[vencedor] == votos[i] && i!= vencedor) {
                empate = true;
            }
        }
        if(empate) {
            System.out.println("Houve empate de " +  votos[vencedor] + " votos"
                    + " entre os candidatos: ");
            for(int i=0; i<4; i++) {
                if (votos[vencedor] == votos[i]) {
                    System.out.printf( nomes[i] + " ");
                }
            }
        } else {
            System.out
                    .println("O canditado " + nomes[vencedor]
                            + "venceu a eleicao com "
                            + votos[vencedor] + " votos!");
        }
        in.close();
    }
}
