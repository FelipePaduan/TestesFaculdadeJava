package capitulo6.exercicios.swap;

public class Main {
    
    public static void main(String[] args) {
        Teste teste1 = new Teste(1);
        Teste teste2 = new Teste(2);
        System.out.println(teste1.a);
        System.out.println(teste2.a);
        Teste.swap(teste1, teste2);
        System.out.println(teste1.a);
        System.out.println(teste2.a);
    }
}
