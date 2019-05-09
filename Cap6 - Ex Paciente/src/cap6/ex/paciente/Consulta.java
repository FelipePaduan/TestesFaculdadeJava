
package cap6.ex.paciente;
import java.time.LocalDate;

public class Consulta {
    private Paciente paciente;
    private LocalDate data;
    
    public Consulta(){
        paciente = null;
        data = null;
    }
    public Consulta(Paciente paciente, LocalDate data){
        this.paciente = paciente;
        this.data = data;
    }
    
    public Paciente getPaciente(){
        return paciente;
    }
    public void setPaciente(Paciente paciente){
        if(paciente == null){
            System.out.println("Paciente inválido");
            return;
        }
        this.paciente = paciente;
        
    }
    public LocalDate getData(){
        return data;
    }
    public void setData(LocalDate data){
        if(data == null){
            System.out.println("Data inválida");
            return;
        }
        this.data = data;
    }
}
