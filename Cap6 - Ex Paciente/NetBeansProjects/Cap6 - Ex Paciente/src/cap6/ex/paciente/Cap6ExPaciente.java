
package cap6.ex.paciente;
import java.time.LocalDate;
import java.time.Month;

public class Cap6ExPaciente {

    
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Irineu", 65);
        Paciente paciente2 = new Paciente("Mateus", 32);
        Paciente paciente3 = new Paciente("Mario", 43);
        Paciente paciente4 = new Paciente("Jorge", 21);
        Paciente paciente5 = new Paciente("Joana", 24);
        Consulta consulta1 = new Consulta(paciente1, LocalDate.of(2019, Month.JUNE, 14));
        System.out.println(paciente1.getNome());
        System.out.println(paciente1.getIdade());
        Mutante mut = new Mutante();
        mut.mudarIdade(paciente1);
        System.out.println(paciente1.getIdade());
        System.out.println(Paciente.getCont());
        Fila fila = new Fila(20);
        fila.entrar(paciente1);
        fila.entrar(paciente2);
        fila.entrar(paciente3);
        fila.entrar(paciente4);
        fila.entrar(paciente5);
        for(int i = 0; i < 5; i++){
            System.out.println(fila.pacientes[i].getNome());
        }
        fila.atender();
        for(int i = 0; i < 5; i++){
            if(fila.pacientes[i] != null){
                System.out.println(fila.pacientes[i].getNome());
            }
            
        }
    }
}
