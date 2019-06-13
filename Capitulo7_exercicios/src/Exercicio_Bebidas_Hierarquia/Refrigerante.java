package Exercicio_Bebidas_Hierarquia;


public class Refrigerante extends Bebida {
    private String sabor;
    
    public Refrigerante(){
        super("","");
        sabor = "";
    }
    public Refrigerante(String sabor, String marca, String nome){
        super(marca, nome);
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    
}
