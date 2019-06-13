package Ponto_Pixel_Circulo;

public class Circulo {
    private double raio;
    private Ponto centro;
    
    public Circulo(){
        raio = 0;
        centro = null;
    }
    public Circulo(double raio, Ponto centro){
        this.raio = raio;
        this.centro = centro;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Ponto getCentro() {
        return centro;
    }

    public void setCentro(Ponto centro) {
        this.centro = centro;
    }
    
}
