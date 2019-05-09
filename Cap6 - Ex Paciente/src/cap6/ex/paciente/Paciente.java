
package cap6.ex.paciente;

public class Paciente {
    private String nome;
    private int idade;
    
    public Paciente(){
        nome = "";
        idade = 0;
    }
    public Paciente(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        if(nome.equals("")){
            System.out.println("Por favor insira um nome válido");
            return;
        }
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        if(idade < 0){
            System.out.println("Por favor insira uma idade válida");
            return;
        }
        this.idade = idade;
    }
}
