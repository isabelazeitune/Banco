public class ContaPoupanca extends Contas {
    private double juros;
    // private double saldoConta;

    // fazer construtor vazio para ter opção de preencher depois
    public ContaPoupanca() {

    }

    public ContaPoupanca(Cliente cliente, double saldo, double juros) {
        super(cliente, saldo);
        this.juros = juros;
       //  this.saldoConta = getSaldo();
    }

    public void recolherJuros(int tempoEmMeses) {
        // saldoConta *= Math.pow((1 + this.juros), tempoEmMeses);
        // setSaldo(getSaldo() * Math.pow((1 + this.juros), tempoEmMeses)); => fazer direto
        double saldoC = getSaldo() * Math.pow((1 + this.juros), tempoEmMeses);
        // System.out.println("Foi recolhido " + (saldoConta - super.getSaldo()) + " em " + tempoEmMeses + " meses.");
        System.out.println("Foi recolhido " + (saldoC - getSaldo()) + " em " + tempoEmMeses + " meses.");
        setSaldo(saldoC);
        // System.out.println("Seu saldo atual é: " + saldoConta);
        System.out.println("Seu saldo atual é: " + getSaldo());

    }

    // não precisa repetir os métodos sacar e depositar, pois já pega do pai


    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
}



