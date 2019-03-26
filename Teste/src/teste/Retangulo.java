package teste;
import java.lang.Math;

public class Retangulo {
    double altura;
    double largura;
    
    Retangulo(){
        largura = 0;
        altura = 0;
    }
    
    double calcularArea(){
        return altura * largura;
    }
    double calcularPerimetro(){
        return (altura*2) + (largura*2);
    }
    double calcularDiagonal(){
        double diagonal = 0;
        diagonal = Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
        return diagonal;
    }
}
