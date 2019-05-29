package listaduplaencadeada;


public class ListaDuplaEncadeada {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        a1.cadastroAluno();
        a2.cadastroAluno();
        a3.cadastroAluno();
        No no1 = new No(a1);
        No no2 = new No(a2);
        No no3 = new No(a3);
        Lista lista = new Lista();
        lista.adicionarNo(no1);
        lista.adicionarNo(no2);
        lista.adicionarNo(no3);
        lista.imprimirAlunos();
    }
    
}
