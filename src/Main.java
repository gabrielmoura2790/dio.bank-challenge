public class Main {
    public static void main(String[] args) {


        Cliente gabriel = new Cliente();
        gabriel.setNome("Gabriel Moura");

        IConta cc = new ContaCorrente(gabriel);

        Banco b = new Banco("Banco Digital");
        b.setContas(cc);


        b.imprimirInfosBank();
        cc.imprimirExtrato();

    }
}
