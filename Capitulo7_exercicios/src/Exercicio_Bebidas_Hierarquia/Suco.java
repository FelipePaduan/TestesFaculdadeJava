package Exercicio_Bebidas_Hierarquia;

public class Suco extends Bebida{
    private String fruta;
    
    public Suco(){
        super("","");
        fruta = "";
    }
    public Suco(String fruta, String marca, String nome){
        super(marca, nome);
        this.fruta = fruta;
    }

    public String getFruta() {
        return fruta;
    }

    public void setFruta(String fruta) {
        this.fruta = fruta;
    }
    
}
