package capitulo6.exercicios.ExProva;

public class Questao {
    private int numero;
    private String enunciado;
    private String resposta;

    Questao(int numero, String enunciado, String resposta){
        this.numero = numero;
        this.enunciado = enunciado;
        this.resposta = resposta;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
    
    
}
