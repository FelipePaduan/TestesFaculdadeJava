package capitulo6.exercicios.swap;

public class Teste {
    int a;
    
    public Teste(int i){
        a = i;
    }
    
    public static void swap(Teste t1, Teste t2){
        Teste aux = new Teste(0);
        aux.a = t1.a;
        t1.a = t2.a;
        t2.a = aux.a;
    }
}
