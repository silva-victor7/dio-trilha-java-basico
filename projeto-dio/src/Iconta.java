public interface Iconta {

    void sacar(double valor);

    void depositar(double valor);

    void transerir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
