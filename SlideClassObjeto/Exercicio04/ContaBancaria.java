public class ContaBancaria {
    String numeroConta;
    String titular;
    double saldo;

public ContaBancaria(String numeroConta, String titular, double saldoInicial) {
    this.numeroConta = numeroConta;
    this.titular = titular;
    this.saldo = saldoInicial;
}

public void depositar(double valor) {
if (valor > 0) {
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
} else {
        System.out.println("Valor de depósito inválido.");
    }
}

public void sacar(double valor) {
if (valor > 0 && valor <= this.saldo) {
        this.saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso.");
} else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
    }
}


public void consultarSaldo() {
    System.out.println("Saldo atual da conta " + this.numeroConta + " (" + this.titular + "): R$" + this.saldo);
}
}