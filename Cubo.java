public class Cubo extends Figura3D implements DimensaoVolumetrica{

    private Quadrado base;

    

    public Cubo(Quadrado base) {
        this.base = base;
    }



    @Override
    public double calcularVolume() {
        return base.calcularArea() * base.getLado();
    }
    
}
