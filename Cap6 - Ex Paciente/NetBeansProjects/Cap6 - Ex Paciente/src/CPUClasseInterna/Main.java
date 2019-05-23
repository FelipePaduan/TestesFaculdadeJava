package CPUClasseInterna;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        cpu.setInstruction("ADD,5,5");
        System.out.println(cpu.executar());
        cpu.setInstruction("AND,true,false");
        System.out.println(cpu.executar());
    }
}
