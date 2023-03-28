public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Circulo: " + new Circulo(2).calcularArea());

        Cilindro cilindro = new Cilindro(new Circulo(2), 3);

        System.out.println("Cilindro: " + cilindro.calcularVolume());

        System.out.println("Quadrado: " + new Quadrado(2).calcularArea());

        Cubo cubo = new Cubo(new Quadrado(2));

        System.out.println("Cubo: " + cubo.calcularVolume());

        Piramide piramideBaseTriangular = new Piramide(new Triangulo(2, 3), 2);
        Piramide piramideBaseQuadrangular = new Piramide(new Quadrado(2), 2);
        Piramide Cone = new Piramide(new Circulo(2), 2);

        System.out.println("Piramide de base triangular: " + piramideBaseTriangular.calcularVolume());
        System.out.println("Piramide de base quadrangular: " + piramideBaseQuadrangular.calcularVolume());
        System.out.println("Piramide de base circular(CONE): " + Cone.calcularVolume());


        

        

    }
}
