
package cap6.ex.paciente;
import java.time.LocalDate;
import java.time.Month;

public class Cap6ExPaciente {

    
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Irineu", 65);
        Consulta consulta1 = new Consulta(paciente1, LocalDate.of(2019, Month.JUNE, 14));
        Lista fila = new Lista();
    }
}
