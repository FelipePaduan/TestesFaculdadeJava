package listaduplaencadeada;


public class Lista {
    public No in;
    public No fim;
    
    public Lista(){
        in = null;
        fim = null;
    }
    public void adicionarNo(No add){
        //checa se a lista está vazia
        if(in == null){
            in = add;
            fim = add;
        }
        else{
            add.ant = fim;
            fim.prox = add;
            fim = add;
        }
    }
    public void imprimirAlunos(){
        No print;
        print = in;
        while(print != null){
            print.aluno.printarAluno();
            print = print.prox;
        }
    }
}
