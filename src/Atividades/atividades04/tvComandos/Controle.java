package tvComandos;


import java.util.Scanner;

public class Controle extends Tv{
    public static void main(String[] args) {

        Tv tv = new Tv();

        tv.Canal = 5;
        tv.Vol = 30;

        System.out.println("=======MENU=========\n"+
                          "Canal Atual = " + tv.Canal + "\n"+
                          "Volume Atual = " + tv.Vol+ "\n"+
                          "=====================");

        System.out.println("============================Ações============================");

        int comando;
        do {
            System.out.println("0-Desligar TV \n" +
                    "1-Diminuir Vol | 2-Aumentar vol, \n" +
                    "3-Subir Canal  | 4-regredir Canal, \n" +
                    "5 Digitar Canal");
            Scanner in = new Scanner(System.in);

            comando = in.nextInt();

            switch (comando) {
                case 0:
                    System.out.println(tv.Delisgartv());
                    continue;
                case 1:
                    tv.diminuirvolume();
                    break;
                case 2:
                    tv.aumentarVolume();
                    break;
                case 3:
                    tv.progredirCanal();
                    break;
                case 4:
                    tv.regredirCanal();
                    break;
                case 5:
                    System.out.println("Digitar Canal");
                    tv.canalIndicado(in.nextInt());
                    break;
                default:
                    throw new IllegalArgumentException("Valor invalido");

            }
            System.out.println("=======MENU=========\n"+
                              "Canal Atual = " + tv.Canal + "\n"+
                              "Volume Atual = " + tv.Vol+ "\n"+
                              "=====================");

        } while (!(comando == 0));




    }

}
