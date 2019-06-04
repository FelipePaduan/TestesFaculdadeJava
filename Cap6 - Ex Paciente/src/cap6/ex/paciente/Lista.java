
package cap6.ex.paciente;
public class Lista {
    private Paciente pacientes[];
    private int primeiro;
    private int ultimo;
    private int tam;
    public Lista(int tam){
        if(tam > 30){
            System.out.println("Tamanho máximo = 30");
            return;
        }
        this.tam = tam;
        pacientes = new Paciente[tam];
    }
    
    public int getUltimo(){
        return ultimo;
    }
    private boolean estaCheia(){
        if(ultimo == tam){
            return true;
        }
        return false;
    }
    private boolean estaVazia(){
        if(pacientes[0] == null){
            return true;
        }
        return false;
    }
    public void atenderPaciente(Paciente paciente){
        if(estaVazia() == false){
        System.out.println(pacientes[primeiro]);
        pacientes[primeiro] = null;
        for(int i = 0; i < ultimo; i++){
            pacientes[i] = pacientes[i+1];
        if(i == ultimo){
            pacientes[ultimo] = null;
            ultimo --;
        }
        }
    }
    }
    public void adicionarPaciente(Paciente paciente){
        if(estaCheia() == false){
            pacientes[ultimo + 1] = paciente;
            ultimo ++;
        }
    }
}
