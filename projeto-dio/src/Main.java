public class Main {

    public static void main(String[] args) {

        Cliente victor = new Cliente();
        victor.setNome("Victor Rodrigues Silva");

        Conta cc = new ContaCorrente(victor);
        Conta poupanca = new ContaPoupanca(victor);

        cc.depositar(500);
        cc.transerir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}