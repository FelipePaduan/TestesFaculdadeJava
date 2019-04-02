
package aplicaçãopaciente;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AplicaçãoPaciente {

    
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do paciente.");
        paciente.nome = sc.nextLine();
        System.out.println("Digite o código do paciente");
        paciente.codigo = sc.nextInt();
        System.out.println("Digite a data de nascimento do paciente");
        paciente.dataNascimento = LocalDate.of(1990, Month.FEBRUARY, 26);
        System.out.println(paciente.dataNascimento);
        
       Consulta consulta = new Consulta();
       consulta.data = LocalDate.of(2019, Month.APRIL, 30);
       consulta.paciente = paciente;
       System.out.println(consulta.paciente.codigo);
    }
    
}
