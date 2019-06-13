package Exercicio_Bebidas_Hierarquia;

public class BebidaAlcoolica extends Bebida{
    private double teorAlcoolico;
    
    public BebidaAlcoolica(){
        super("","");
        teorAlcoolico = 0;
    }
    public BebidaAlcoolica(double teorAlcoolico, String marca, String nome){
        super(marca, nome);
        this.teorAlcoolico = teorAlcoolico;
    }

    public double getTeorAlcoolico() {
        return teorAlcoolico;
    }

    public void setTeorAlcoolico(double teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }
}
