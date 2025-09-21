public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("12345-6", "Gleici", 1000.0);
        ContaBancaria conta2 = new ContaBancaria("54256-9", "Carlos Souza", 500.0);

    System.out.println("Status Inicio");
        conta1.consultarSaldo();
        conta2.consultarSaldo();
        System.out.println();

    System.out.println("Operações na Conta 1");
        conta1.depositar(250.50);
        conta1.sacar(150.0);
        conta1.consultarSaldo();
        System.out.println();

    System.out.println("Operações na Conta 2");
        conta2.depositar(100.0);
        conta2.sacar(700.0);
        conta2.sacar(300.0);
        conta2.consultarSaldo();
    }
}