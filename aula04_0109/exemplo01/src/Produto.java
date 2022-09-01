/**
 * @author Maromo
 * @since 2022 sept
 * @version 0.1 Beta
 * Classe Produto: Classe que representa os produtos da loja
 * RF 01 - Cadastro de Cliente
 */
public class Produto {
    private int codigo;
    private String nome;
    private double valor;
    private int quantidadeEmEstoque;

    //métodos getters - setters.
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    //nosso imprimir (cai fora)


    /**
     *
     * @return Dados do produto para a interface do usuario
     * apresentando todos os dados
     */
    @Override
    public String toString() {
        return "Dados do Produto{" + "\n" +
                "codigo=" + codigo + "\n" +
                ", nome='" + nome + '\'' + "\n" +
                ", valor=" + valor + "\n" +
                ", quantidadeEmEstoque=" + quantidadeEmEstoque +
                '}';
    }
}
