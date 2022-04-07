package media;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Neste programa iremos passar as notas de um aluno e exibir sua média:");

        System.out.println("Digite a matricula:");
        int matricula = sc.nextInt();
        System.out.println("Digite o nome do aluno:");
        String name = sc.next();
        System.out.println("Digite a primeira nota:");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a nota do trabalho:");
        double notaTrab = sc.nextDouble();

        Alunos aluno = new Alunos(matricula, name, nota1, nota2, notaTrab);


        System.out.println("===================================="+"\n"+
                           "aluno: " +aluno.getNome()+"\n"+
                           "Matricula: " +aluno.getMatricula()+"\n"+
                           "Status: " +aluno.calcMedia());

        }

    }


