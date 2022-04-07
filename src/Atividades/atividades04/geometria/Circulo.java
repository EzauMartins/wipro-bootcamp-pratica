package geometria;

public class Circulo implements FormaGeometrica{

    @Override
    public String cor() {
        return "vermelho";
    }

    @Override
    public String quantidadeDeLados() {
        return "Forma geometrica circular(Sem LADOS)";
    }

    @Override
    public double area(double a, double b) {
        return 0;
    }

    public double area(double a){
       return 3.14*(Math.pow(a, 2));
    }
}
