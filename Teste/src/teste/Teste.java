package teste;
import java.util.Scanner;
public class Teste {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Quadrado quadrado = new Quadrado();
        quadrado.lado = scan.nextDouble();
        double areasqr = quadrado.calcularArea();
        double perimetrosqr = quadrado.calcularPerimetro();
        System.out.println("O perímetro do quadrado é de: " + perimetrosqr + " cm²");
        System.out.println("A área do quadrado é de: " + areasqr + " cm²");
        System.out.println("");
    
        Retangulo ret = new Retangulo();
        ret.altura = scan.nextDouble();
        ret.largura = scan.nextDouble();
        double diagonal = ret.calcularDiagonal();
        double arearet = ret.calcularArea();
        double perimetroret = ret.calcularPerimetro();
        System.out.println("O perímetro do retângulo é de: " + perimetroret + " cm²");
        System.out.println("A área do retângulo é de: " + arearet + " cm²");
        System.out.println("A diagonal do retângulo é de tamanho: " + diagonal + " cm²");
    }
    
}
