package Exercicio_Hierarquia_Robos;
import Ponto_Pixel_Circulo.Ponto;
public class RoboPlutoniano extends RoboMarciano{
    private int municao;
    private int tamCartucho;
    private int estoqueMunicao;
    
    public RoboPlutoniano(){
        super(0, "", null);
        municao = 0;
        tamCartucho = 0;
    }
    
    public RoboPlutoniano(int codigo, String nome, Ponto pos, int municao, int tamCartucho, int estoqueMunicao){
        super(codigo, nome, pos);
        this.municao = municao;
        this.tamCartucho = tamCartucho;
        this.estoqueMunicao = estoqueMunicao;
    }
    
    public void atirar(){
        if(getMunicao() > 0){
            setMunicao(getMunicao() - 1);
        }
        else{
            System.out.println("Munição insuficiente");
        }
        
    }
    
    public void recarregar(){
        if(estoqueMunicao > tamCartucho - municao){
            estoqueMunicao -= tamCartucho - municao;
            municao = tamCartucho;
        }
        else if(estoqueMunicao < tamCartucho - municao && estoqueMunicao != 0){
            municao += estoqueMunicao;
            estoqueMunicao = 0;
        }
        else if(estoqueMunicao == 0 ){
            System.out.println("Sem municao para recarregar");
        }
    }
    
    public int getMunicao() {
        return municao;
    }

    public void setMunicao(int municao) {
        this.municao = municao;
    }

    public int getTamCartucho() {
        return tamCartucho;
    }

    public void setTamCartucho(int tamCartucho) {
        this.tamCartucho = tamCartucho;
    }

    public int getEstoqueMunicao() {
        return estoqueMunicao;
    }

    public void setEstoqueMunicao(int estoqueMunicao) {
        this.estoqueMunicao = estoqueMunicao;
    }
    
    
}
