package cap6.ex.paciente;

public class Fila {

    public Paciente pacientes[];
    int inicio, fim, tamanhoMax, tamanhoAtual;

    public Fila(int tamanhoMax) {
        pacientes = new Paciente[tamanhoMax];
        this.tamanhoMax = tamanhoMax;
        inicio = -1;
        fim = -1;
        this.tamanhoAtual = 0;
    }

    public void entrar(Paciente paciente) {
        if (this.estaCheia()) {
            return;
        }
        fim = (fim + 1) % tamanhoMax;
        pacientes[fim] = paciente;
        tamanhoAtual++;
        if (inicio == -1) {
            inicio = fim;
        }
    }

    public Paciente atender() {
        if (this.estaVazia()) {
            return null;
        }
        Paciente temp;
        temp = getPacientes()[inicio];
        pacientes[inicio] = null;
        inicio = (inicio + 1) % tamanhoMax;
        tamanhoAtual--;
        return temp;
    }

    public boolean estaCheia() {
        return tamanhoAtual == tamanhoMax;
    }

    public boolean estaVazia() {
        return tamanhoAtual == 0;
    }

    public Paciente[] getPacientes() {
        return pacientes;
    }
    
    
}