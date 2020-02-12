public class ContaCorrente extends Contas {
    private double limiteAutorizado;
    private double saldoConta;
    private Cheque cheque;

    public ContaCorrente(Cliente cliente, double saldo, double limiteAutorizado) {
        super(cliente, saldo);
        this.limiteAutorizado = limiteAutorizado;
        this.saldoConta = getSaldo();
    }


    public void depositarDinheiro(double dinheiroMovimentado) {
        if(dinheiroMovimentado > 0) {
            this.saldoConta += dinheiroMovimentado;
            System.out.println("Foi depositado " + dinheiroMovimentado + "reais em dinheiro.");
            System.out.println("Seu saldo atual é: " + this.saldoConta);
        } else {
            System.out.println("Não é possível efetuar esta operação.");
        }
    }

    public void depositarCheque (Cheque cheque) {
        if(cheque.getValor() > 0) {
            this.saldoConta += cheque.getValor();
            System.out.println("Foi depositado " + cheque.getValor() + "reais em cheque.");
            System.out.println("Seu saldo atual é : " + saldoConta);
            System.out.println("O cheque depositado possui banco emissor: " + cheque.getBancoEmissor() + ", e data de pagamento: " + cheque.getDataDePagamento());
        }
    }

    public void sacar(double dinheiroMovimentado) {
        if(this.saldoConta >= dinheiroMovimentado) {
            this.saldoConta -= dinheiroMovimentado;
            System.out.println("Seu saldo atual é: " + this.saldoConta);
        } else {
            if(saldoConta<dinheiroMovimentado & saldoConta + limiteAutorizado > dinheiroMovimentado) {
                this.saldoConta -= dinheiroMovimentado;
                System.out.println("Você está utilizando Cheque Especial. Seu saldo atual é: " + saldoConta);
            } else {
                System.out.println("Não é possível efetuar esta operação.");
            }
        }
    }
}
