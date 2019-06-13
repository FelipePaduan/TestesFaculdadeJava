package Exercicio_Hierarquia_Robos;
import Ponto_Pixel_Circulo.Ponto;

public class Main {
    public static void main(String[] args) {
        Ponto inicial = new Ponto(0, 0);
        RoboPlutoniano robop1 = new RoboPlutoniano(007, "Atom", inicial, 30, 30, 300);
        System.out.println("Municao: " + robop1.getMunicao());
        System.out.println("Estoque:" + robop1.getEstoqueMunicao());
        for(int i = 0; i < 20; i++){
            robop1.atirar();
        }
        System.out.println("Municao: " + robop1.getMunicao());
        System.out.println("Estoque:" + robop1.getEstoqueMunicao());
        robop1.recarregar();
        System.out.println("Municao: " + robop1.getMunicao());
        System.out.println("Estoque:" + robop1.getEstoqueMunicao());
        robop1.setMunicao(0);
        robop1.setEstoqueMunicao(0);
        robop1.recarregar();
        System.out.println("Municao: " + robop1.getMunicao());
        System.out.println("Estoque:" + robop1.getEstoqueMunicao());
    }
}
