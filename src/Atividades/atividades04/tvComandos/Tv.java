package tvComandos;

import java.util.Scanner;

public class Tv {


        int Vol;
        int Canal;

        Scanner in = new Scanner(System.in);

        public void diminuirvolume(){
           Vol = Vol-10;
        }
        public void aumentarVolume(){
           Vol = Vol+10;
        }
        public void regredirCanal(){
            Canal = Canal-1;
        }
        public void progredirCanal(){
           Canal = Canal+1;

        }
        public void canalIndicado(int novocanal){
            Canal = novocanal;
        }









        }



