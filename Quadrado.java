
public class Quadrado extends Figura2D implements DimensaoSuperficial {

    private double lado;

    

    public Quadrado(double lado) {
        this.lado = lado;
    }

    



    @Override
    public double calcularArea() {
        return lado * lado;
    }



    protected double getLado() {
        return lado;
    }
    
}
