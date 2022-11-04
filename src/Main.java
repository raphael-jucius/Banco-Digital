public class Main {
    public static void main(String[] args) {
        Cliente raphael = new Cliente();
        raphael.setNome("Raphael");

        Conta cc = new ContaCorrente(raphael);
        Conta cp = new ContaPoupanca(raphael);

        cc.depositar(100);
        cc.transferir(50,cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
