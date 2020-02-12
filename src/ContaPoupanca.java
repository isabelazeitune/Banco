public class ContaPoupanca extends Contas {
    private double juros;
    private double saldoConta;

    public ContaPoupanca(Cliente cliente, double saldo, double juros) {
        super(cliente, saldo);
        this.juros = juros;
        this.saldoConta = getSaldo();
    }

    public void recolherJuros(int tempoEmMeses) {
        saldoConta *= Math.pow((1 + this.juros), tempoEmMeses);
        System.out.println("Foi recolhido " + (saldoConta - super.getSaldo()) + " em " + tempoEmMeses + " meses.");
        System.out.println("Seu saldo atual é: " + saldoConta);
    }

    public void sacar(double dinheiroMovimentado) {
        if (this.saldoConta >= dinheiroMovimentado) {
            this.saldoConta -= dinheiroMovimentado;
            System.out.println("Foi sacado " + dinheiroMovimentado + "reais em dinheiro.");
            System.out.println("Seu saldo atual é: " + this.saldoConta);
        } else {
            System.out.println("Não é possível efetuar esta operação.");
        }
    }

    public void depositar(double dinheiroMovimentado) {
        if (dinheiroMovimentado > 0) {
            this.saldoConta += dinheiroMovimentado;
            System.out.println("Foi depositado " + dinheiroMovimentado + "reais em dinheiro.");
            System.out.println("Seu saldo atual é: " + this.saldoConta);
        } else {
            System.out.println("Não é possível efetuar esta operação.");
        }
    }

}



