import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<IConta> contas = new ArrayList<IConta>();

    public Banco(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<IConta> getContas() {
        return contas;
    }

    public void setContas(IConta conta){
        this.contas.add(conta);
    }

    public void imprimirInfosBank() {
        System.out.println(String.format("\t\t=== %s ===", getNome()));
        System.out.println("\t    <= lista de contas =>\n\n");
        for(IConta conta : contas){
            conta.imprimeNome();
        }
        System.out.println("\n");
    }
}
