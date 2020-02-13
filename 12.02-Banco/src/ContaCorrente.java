public class ContaCorrente extends Contas {
    private double limiteAutorizado;
    private Cheque cheque;
    // private double saldoConta;

    // fazer construtor vazio para ter opção de preencher depois
    public ContaCorrente() {

    }

    public ContaCorrente(Cliente cliente, double saldo, double limiteAutorizado) {
        super(cliente, saldo);
        this.limiteAutorizado = limiteAutorizado;
        // this.saldoConta = getSaldo();
    }

    // public void depositarDinheiro(double dinheiroMovimentado) {
        // if(dinheiroMovimentado > 0) {
            // this.saldoConta += dinheiroMovimentado;
            // System.out.println("Foi depositado " + dinheiroMovimentado + "reais em dinheiro.");
            // System.out.println("Seu saldo atual é: " + this.saldoConta);
        // } else {
            // System.out.println("Não é possível efetuar esta operação.");
        // }
    // }

    public void depositarCheque (Cheque cheque) {
        depositar(cheque.getValor());
        // if(cheque.getValor() > 0) {
            // this.saldoConta += cheque.getValor();
            // System.out.println("Foi depositado " + cheque.getValor() + "reais em cheque.");
            // System.out.println("Seu saldo atual é : " + saldoConta);
            System.out.println("O cheque depositado possui banco emissor: " + cheque.getBancoEmissor() + ", e data de pagamento: " + cheque.getDataDePagamento());
        // }
    }

    public void sacar(double dinheiroMovimentado) {
        double saldoLocal = getSaldo();
        // if(this.saldoConta >= dinheiroMovimentado) {
        if(saldoLocal >= dinheiroMovimentado) {
            // this.saldoConta -= dinheiroMovimentado;
            saldoLocal -= dinheiroMovimentado;
            setSaldo(saldoLocal);
            // System.out.println("Seu saldo atual é: " + this.saldoConta);
            System.out.println("Seu saldo atual é: " + saldoLocal);
        } else {
            // if(saldoConta<dinheiroMovimentado & saldoConta + limiteAutorizado > dinheiroMovimentado) {
            if(saldoLocal < dinheiroMovimentado & saldoLocal + limiteAutorizado >= dinheiroMovimentado) {
                // double diferenca = dinheiroMovimentado - saldoLocal; => NÃO PRECISA, pois conta negativa e limite inicial dá na mesma
                //this.limiteAutorizado -= diferenca; => NÃO PRECISA, pois conta negativa e limite inicial dá na mesma
                // this.saldoConta -= dinheiroMovimentado;
                saldoLocal -= dinheiroMovimentado;
                setSaldo(saldoLocal);
                // System.out.println("Você está utilizando Cheque Especial. Seu saldo atual é: " + saldoConta);
                System.out.println("Você está utilizando Cheque Especial. Seu saldo atual é: " + saldoLocal);
            } else {
                System.out.println("Não é possível efetuar esta operação.");
            }
        }
    }
}
