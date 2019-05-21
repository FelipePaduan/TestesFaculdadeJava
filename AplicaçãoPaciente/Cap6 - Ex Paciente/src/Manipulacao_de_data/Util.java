package Manipulacao_de_data;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Util {
    public static String formatarData(LocalDate data){
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return data.format(formatador);
    }
}
