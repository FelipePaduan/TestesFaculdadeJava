package capitulo6.exercicios.ExProva;


public class Prova {
    private String nomeAluno;
    private Questao questoes[];

    public Prova(){
        nomeAluno = "";
        questoes = new Questao[10];
    }
    
    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public Questao[] getQuestoes() {
        return questoes;
    }

    public void setQuestoes(Questao[] questoes) {
        this.questoes = questoes;
    }

}
