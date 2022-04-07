package media;

class Alunos {

    private int matricula;
    private String nome;
    private double nota1;
    private double nota2;
    private double notaTrab;

    public Alunos(int matricula, String nome, double nota1, double nota2, double notaTrab) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaTrab = notaTrab;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNotaTrab() {
        return notaTrab;
    }

    public void setNotaTrab(double notaTrab) {
        this.notaTrab = notaTrab;
    }

    public String calcMedia() {
        double media = ((((nota1+nota2)*1.5) + (notaTrab * 2))/ 5);

        if (media >= 7){
            return "Aluno aprovado média: "+media;
        }else{
            return "Aluno reprovado média: "+media;
        }




}





     /* public double calcMedia() {
        double media = ((((nota1+nota2)*1.5) + (notaTrab * 2))/ 5);

        if (media > 7){
            return 0.0;
        }else{
            return media;
        }



      }*/
}
