public class Main {

    public static void main(String[] args) {
        Cliente clienteTeste1 = new Cliente(1, "Sobrenome1", "111111111", "11111111111");
        Cliente clienteTeste2 = new Cliente(2,"Sobrenome2", "222222222", "22222222222");
        Cliente clienteTeste3 = new Cliente(3, "Sobrenome3", "333333333", "33333333333");

        System.out.println("Conta com saldo 100,00:");
        Contas contaTeste1 = new Contas(clienteTeste1, 100);
        System.out.println("Consulta do saldo:");
        contaTeste1.consultar();
        System.out.println("Depósito 100,00 em dinheiro:");
        contaTeste1.depositar(100);
        System.out.println("Saque 50,00 em dinheiro:");
        contaTeste1.sacar(50);

        System.out.println("---------------------------------------------------------");

        System.out.println("Conta poupança com saldo 100,00 e juros 1 (100%):");
        ContaPoupanca contaPTeste1 = new ContaPoupanca(clienteTeste2, 100, 1);
        System.out.println("Recolhimento de juros em 1 mês:");
        contaPTeste1.recolherJuros(1);
        System.out.println("Depósito 100,00 em dinheiro:");
        contaPTeste1.depositar(100);
        System.out.println("Saque 50,00 em dinheiro:");
        contaPTeste1.sacar(50);

        System.out.println("---------------------------------------------------------");

        System.out.println("Conta corrente com saldo 100,00 e limite autorizado 100,00");
        ContaCorrente contaCTeste1 = new ContaCorrente(clienteTeste3, 100, 100);
        System.out.println("Depósito 100,00 em dinheiro");
        contaCTeste1.depositar(100);
        System.out.println("Depósito 50,00 em cheque");
        Cheque cheque = new Cheque(50, "banco", "dia/mes/ano");
        contaCTeste1.depositarCheque(cheque);
        System.out.println("Saque 50,00 em dinheiro / não utiliza Cheque Especial");
        contaCTeste1.sacar(50);
        System.out.println("Saque 250,00 em dinheiro / utiliza Cheque Especial");
        contaCTeste1.sacar(250);
        System.out.println("Saque 100,00 em dinheiro / impossível");
        contaCTeste1.sacar(100);
    }
}
