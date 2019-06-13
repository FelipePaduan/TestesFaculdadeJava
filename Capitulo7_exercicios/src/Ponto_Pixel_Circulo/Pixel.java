package Ponto_Pixel_Circulo;


public class Pixel extends Ponto{
    private String cor;
    
    public Pixel(String cor, int x, int y){
        super(x, y);
        this.cor = cor;
    }
    public Pixel(){
        cor = "";
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
