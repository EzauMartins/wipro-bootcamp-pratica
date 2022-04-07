package tvComandos;


import java.util.Scanner;

public class Controle extends Tv{
    public static void main(String[] args) {

    Tv tv = new Tv();

    tv.Canal = 5;
    tv.Vol = 30;

    System.out.println("TV LIGADA");
    System.out.println("Canal Atual = "+tv.Canal);
    System.out.println("Volume Atual = "+tv.Vol);

    System.out.println("============================Ações============================");

    System.out.println("1-Diminuir Vol, 2-Aumentar vol, 3-Subir Canal, 4-regredir Canal, 5 Digitar Canal");
    Scanner in = new Scanner(System.in);

    int comando = in.nextInt();

    switch (comando){
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

        System.out.println("Canal Atual = "+tv.Canal);
        System.out.println("Volume Atual = "+tv.Vol);





    }

}
