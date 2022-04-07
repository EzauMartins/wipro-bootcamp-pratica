package geometria;

public class Triangulo implements FormaGeometrica{

    @Override
    public String cor() {
        return "verde";
    }

    @Override
    public String quantidadeDeLados() {
        String Menssagem = "Forma geometrica com 3 Lados";
        return Menssagem;
    }

    @Override
    public double area(double a, double b) {

        double area = (a*b)/2;
        return area;
    }
}
