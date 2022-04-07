package geometria;

import java.util.Scanner;

public class CalculoGeometrico {
    public static void main(String[] args) {

        int cont = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("====================================\n"+
                            "\t\tCalcular Forma Geometrica \n" +
                           "====================================");

        do {
            System.out.println("[1]= Triangulo \n" +
                    "[2]= Quadrado\n" +
                    "[3]= Retangulo\n" +
                    "[4]= Circulo");

            String verifca = in.next();

            if (!verifca.matches("[1-4]")) {
                System.out.println("Valor incorreto digite novamente\n" +
                                   "====================================");
                cont = 1;
                continue;
            }

            int resp = Integer.parseInt(verifca);

            if (resp == 1) {
                Triangulo tr = new Triangulo();
                System.out.println("===inicio Calculo===(Triangulo)\n" +
                        "informe primeiro valor (Base):");
                double val1 = in.nextDouble();
                System.out.println("informe segundo valor (Altura):");
                double val2 = in.nextDouble();

                System.out.println("Area do triangulo = " + tr.area(val1, val2) +
                        "\n" + tr.quantidadeDeLados());
            }

            if (resp == 2) {
                Quadrado qd = new Quadrado();
                System.out.println("===inicio Calculo(Quadrado)=== \n" +
                        "informe valor (Lado):");
                double val1 = in.nextDouble();
                System.out.println("Area do quadrado = " + qd.area(val1) +
                        "\n" + qd.quantidadeDeLados());
            }

            if (resp == 3) {
                Retangulo rt = new Retangulo();
                System.out.println("===inicio Calculo(Retangulo)=== \n" +
                        "informe primeiro valor (Lado Menor):");
                double val1 = in.nextDouble();
                System.out.println("informe segundo valor (Lado Maior):");
                double val2= in.nextDouble();

                System.out.println("Area do Retangulo = " + rt.area(val1, val2) +
                        "\n" + rt.quantidadeDeLados());
            }

            if (resp == 4) {
                Circulo cr = new Circulo();
                System.out.println("===inicio calculo(Circulo)=== \n" +
                        "informe um valor (Raio):");
                double val1 = in.nextDouble();
                System.out.println("Area do Circulo = " + cr.area(val1) +
                        "\n" + cr.quantidadeDeLados());
            }

            System.out.println( "================================== \n" +
                                "Digite 1 para continuar calculando \n" +
                                "Digite 2 para finalizar");

            cont = in.nextInt();

        }while (cont == 1);

        System.out.println("*-Sistema encerrado-*");
    }
}
