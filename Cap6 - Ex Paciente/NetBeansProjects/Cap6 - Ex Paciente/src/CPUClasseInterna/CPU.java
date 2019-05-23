package CPUClasseInterna;

public class CPU {
    private String instruction;
    
    public String executar(){
        ULA ula = new ULA();
        return ula.processarInstrucao(); 
        
    }
    
    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }
    public class ULA{
        public String processarInstrucao(){
            String partes[] = instruction.split(",");
            if(partes[0].equals("ADD")){
                int soma = 0;
                for(int i = 1; i < partes.length; i++){
                    int n = Integer.parseInt(partes[i]);
                    soma += n;
                }
                
                return ""+soma;
            }
            else if(partes[0].equals("AND")){
                boolean bool = Boolean.valueOf(partes[1]) && Boolean.valueOf(partes[2]);
                return ""+bool;
            }
            else{
                return "";
            }
        }
    }
}
