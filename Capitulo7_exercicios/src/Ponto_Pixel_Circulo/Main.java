package Ponto_Pixel_Circulo;

public class Main {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(1, 3);
        Circulo circulo1 = new Circulo(5.2, p1);
        System.out.println("Raio:" + circulo1.getRaio());
        System.out.println("X:" + circulo1.getCentro().getX());
        System.out.println("Y:" + circulo1.getCentro().getY());
    }
}
