import java.util.List;

public abstract class Conta implements IConta {

    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        if(valor < 0) {
            throw new RuntimeException("Valor muito baixo!");
        }
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if(valor >= this.saldo){
            throw new RuntimeException("Saldo insuficiente!");
        }
        this.saldo -= valor;
    }

    @Override
    public void tranferir(double valor, IConta contaDestino) {
        if(valor >= this.saldo){
            throw new RuntimeException("Valor indisponível!");
        }
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agência: 00%d%n", this.agencia);
        System.out.printf("Conta: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }

    protected void getNomeCliente() {
        System.out.printf("Titular 0%d: %s%n", this.numero,this.cliente.getNome());
    }
}
