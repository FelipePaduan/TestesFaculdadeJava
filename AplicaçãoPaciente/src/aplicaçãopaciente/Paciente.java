
package aplicaçãopaciente;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Paciente {
    int codigo;
    String nome;
    LocalDate dataNascimento;
    
    public Paciente(){
        codigo = 0;
        nome = "";
        dataNascimento = null;
    }
}

