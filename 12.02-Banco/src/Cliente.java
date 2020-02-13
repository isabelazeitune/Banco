public class Cliente {
    private int numeroDeCliente;
    private String sobrenome;
    private String RG;
    private String CPF;

    // fazer construtor vazio para ter opção de preencher depois
    public Cliente() {

    }

    public Cliente(int numeroDeCliente, String sobrenome, String RG, String CPF) {
        this.numeroDeCliente = numeroDeCliente;
        this.sobrenome = sobrenome;
        this.RG = RG;
        this.CPF = CPF;
    }

    public int getNumeroDeCliente() {
        return numeroDeCliente;
    }

    public void setNumeroDeCliente(int numeroDeCliente) {
        this.numeroDeCliente = numeroDeCliente;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
