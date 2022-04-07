package geometria;

public class Retangulo implements FormaGeometrica{
    @Override
    public String cor() {
        return "amarelo";
    }

    @Override
    public String quantidadeDeLados() {
        String Menssagem = "Forma geometrica com 4 Lados";
        return Menssagem ;
    }

    @Override
    public double area(double a, double b) {
        return a*b;
    }
}
