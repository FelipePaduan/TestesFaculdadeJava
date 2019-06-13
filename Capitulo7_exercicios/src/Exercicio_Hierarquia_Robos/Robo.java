package Exercicio_Hierarquia_Robos;
import Ponto_Pixel_Circulo.Ponto;
import java.util.Set;
public class Robo {
    private int codigo;
    private String nome;
    private Ponto pos;
    
    public Robo(){
        codigo = 0;
        nome = "";
        pos = null;
    }
    public Robo(int codigo, String nome, Ponto pos){
        this.codigo = codigo;
        this.nome = nome;
        this.pos = pos;
    }
    
    public void andarFrente(){
        pos.setX(pos.getX() + 1);
    }
    
    public void andarTras(){
        pos.setX(pos.getX() - 1);
    }
    
    public void andarCima(){
        pos.setY(pos.getY() + 1);
    }
    
    public void andarBaixo(){
        pos.setY(pos.getY() - 1);
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Ponto getPos() {
        return pos;
    }

    public void setPos(Ponto pos) {
        this.pos = pos;
    }
    
}
