package Exercicio_Hierarquia_Robos;
import Ponto_Pixel_Circulo.Ponto;
public class RoboMarciano extends Robo{
    
    public RoboMarciano(){
        super(0, "", null);
    }
    
    public RoboMarciano(int codigo, String nome, Ponto pos){
        super(codigo, nome, pos);
    }
    
    public void teletransportar(Ponto p){
        setPos(p);
    }
}
