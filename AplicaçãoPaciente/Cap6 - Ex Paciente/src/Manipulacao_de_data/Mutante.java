package Manipulacao_de_data;
import java.time.LocalDate;
public class Mutante {
    
    public LocalDate mudarData(LocalDate d, int ano){
        return d.withYear(ano);        
    }
    public LocalDate mudarData(LocalDate d, int ano, int mes){
        d = this.mudarData(d, ano);
        return d.withMonth(mes);
    }
    public LocalDate mudarData(LocalDate d, int ano, int mes, int dia){
        d = this.mudarData(d, ano, mes);
        return d.withDayOfMonth(dia);
    }
}
