package Varargs;

public class Metodo {
    public static double calcular(String op, double ... n){
        if(op.equals("SOM")){
            double soma = 0;
            for(int i = 0; i < n.length; i++){
                soma += n[i];
            }
            return soma;
        }
        else if(op.equals("MULT")){
            double produto = 1;
            for(int i = 0; i < n.length; i++){
                produto *= n[i];
            }
            return produto;
        }
        else{
            System.out.println("Operação inválida (utilize SOM ou MULT)");
            return 0;
        }
    }
}
