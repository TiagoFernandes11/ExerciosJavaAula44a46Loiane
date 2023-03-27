public class Piramide extends Figura3D implements DimensaoVolumetrica {

    private DimensaoSuperficial basePiramide;
    private double altura;


    public Piramide(Figura2D basePiramide, double altura) {
        this.basePiramide = (DimensaoSuperficial) basePiramide;
        this.altura = altura;
    }


    @Override
    public double calcularVolume() {
        return (basePiramide.calcularArea() * this.altura) / 3;
    }


    
    
}
