public class Contas {
    private Cliente cliente;
    private double saldo;

    public Contas(Cliente cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public void depositar(double dinheiroMovimentado) {
        if(dinheiroMovimentado > 0) {
            this.saldo += dinheiroMovimentado;
            System.out.println("Seu saldo atual é: " + this.saldo);
        } else {
            System.out.println("Não é possível efetuar esta operação.");
        }
    }

    public void sacar(double dinheiroMovimentado) {
        if(this.saldo >= dinheiroMovimentado) {
            this.saldo -= dinheiroMovimentado;
            System.out.println("Seu saldo atual é: " + this.saldo);
        } else {
            System.out.println("Não é possível efetuar esta operação.");
        }
    }

    public void consultar() {
        System.out.println("O seu saldo atual é: " + this.saldo);
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
