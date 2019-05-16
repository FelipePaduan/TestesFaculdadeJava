package Manipulacao_de_data;
import java.time.LocalDate;
public class Main {
    
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.of(1999, 5, 29);
        Mutante mut = new Mutante();
        hoje = mut.mudarData(hoje, 2000);
        System.out.println(hoje);
        hoje = mut.mudarData(hoje, 2001, 6);
        System.out.println(hoje);
        hoje = mut.mudarData(hoje, 2002, 7, 30);
        System.out.println(hoje);
    }
}
