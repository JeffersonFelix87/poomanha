import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int idCliente;
    private String nome;
    private String tipoPagamento;
    private List<Carro> carros = new ArrayList<>();

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    //Recebe um obj do tipo Carro e adiciona na lista
    public void adicionarCarro(Carro carro){
        carros.add(carro);
    }

    @Override
    public String toString() {
        String lista = "";
        for(Carro carro : carros){
            lista += carro.toString();
        }
        String cliente = "";
        cliente += "Dados do Cliente: \n" +
            "Nome: " + nome + "\n" +
            "Tipo de Pagamento: " + tipoPagamento + "\n" +
            "Lista dos carros do cliente: " + "\n" +
            lista + "\n";
        return cliente;
    }
}
