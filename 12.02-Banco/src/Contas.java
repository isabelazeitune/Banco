public class Contas {
    private Cliente cliente;
    private double saldo;

    // fazer construtor vazio para ter opção de preencher depois
    public Contas() {

    }

    public Contas(Cliente cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public void depositar(double dinheiroMovimentado) {
        if(dinheiroMovimentado > 0) {
            this.saldo += dinheiroMovimentado;
            System.out.println("Foi depositado " + dinheiroMovimentado + " reais.");
            System.out.println("Seu saldo atual é: " + this.saldo);
        } else {
            System.out.println("Não é possível efetuar esta operação.");
        }
    }

    public void sacar(double dinheiroMovimentado) {
        if(this.saldo >= dinheiroMovimentado) {
            this.saldo -= dinheiroMovimentado;
            System.out.println("Foi sacado " + dinheiroMovimentado + " reais.");
            System.out.println("Seu saldo atual é: " + this.saldo);
        } else {
            System.out.println("Não é possível efetuar esta operação.");
        }
    }

    public void consultar() {
        System.out.println("O seu saldo atual é: " + this.saldo);
    }

    // fazer método para consultar dados dos clientes
    public void consultarDado(Contas conta) {
        System.out.println("Número da conta: " + conta.getCliente().getNumeroDeCliente());
        System.out.println("Sobrenome do cliente: " + conta.getCliente().getSobrenome());
        System.out.println("Número do RG: " + conta.getCliente().getRG());
        System.out.println("Número do CPF: " + conta.getCliente().getCPF());
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
