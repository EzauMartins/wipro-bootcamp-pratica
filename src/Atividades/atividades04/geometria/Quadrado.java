package geometria;

public class Quadrado implements FormaGeometrica{
    @Override
    public String cor() {
        return "laranja";
    }

    @Override
    public String quantidadeDeLados() {
        String Menssagem = "Forma geometrica com 4 Lados";
        return  Menssagem;
    }

    @Override
    public double area(double a, double b) {
        return 0;
    }

    public double area(double a){
        return a*a;
    }
}
