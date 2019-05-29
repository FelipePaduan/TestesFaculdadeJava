package listaduplaencadeada;
import java.util.Scanner;
public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private double nota;
    private Scanner scan = new Scanner(System.in);
    
    public String getAluno() {
        return nome;
    }

    public void setAluno(String aluno) {
        this.nome = aluno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    public void cadastroAluno(){
        System.out.println("Digite o nome do aluno");
        this.nome = scan.nextLine();
        System.out.println("Digite o número de matrícula");
        this.matricula = scan.nextLine();
        System.out.println("Digite o curso escolhido");
        this.curso = scan.nextLine();
        System.out.println("Digite a nota do aluno");
        this.nota = scan.nextDouble();
        
    }
    public void printarAluno(){
        System.out.println(nome);
        System.out.println(matricula);
        System.out.println(curso);
        System.out.println(nota);
        System.out.println("______________");
    }
}
