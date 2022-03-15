public interface IConta {

    void depositar(double valor);

    void sacar(double valor);

    void tranferir(double valor, IConta contaDestino);

    void imprimirExtrato();

    void imprimeNome();

}
