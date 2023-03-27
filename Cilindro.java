public class Cilindro  extends Figura3D implements DimensaoVolumetrica{

    private Circulo circulo;
    private double altura;

    

    public Cilindro(Circulo circulo, double altura) {
        this.circulo = circulo;
        this.altura = altura;
    }


    @Override
    public double calcularVolume() {
        return circulo.calcularArea() * altura;
    }
    
}
