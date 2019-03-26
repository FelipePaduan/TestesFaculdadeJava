package teste;

public class Quadrado {
    double lado;
    
    Quadrado(){
        lado = 0;
    }
    
    double calcularArea(){
        return lado*lado;
    }
    double calcularPerimetro(){
        return lado*4;
    }
}
