public class Triangulo extends Figura2D implements DimensaoSuperficial{

    private double base;
    private double altura;

    

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    @Override
    public double calcularArea() {
        return (base * altura)/2;
    }
    
}
