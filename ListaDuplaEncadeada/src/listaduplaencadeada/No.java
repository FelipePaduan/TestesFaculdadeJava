package listaduplaencadeada;

public class No {
    public Aluno aluno;
    public No prox;
    public No ant;
    
    public No(){
        prox = null;
        ant = null;
    }
    
    public No(Aluno aluno){
        this.aluno = aluno;
        prox = null;
        ant = null;
    }
}
