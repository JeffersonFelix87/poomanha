public class Computador {
    private String marca;
    private String cor;
    private String modelo;
    private long numeroSerie;
    private double preco;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public long getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(long numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Computador{" + "\n" +
                "marca='" + marca + '\'' + "\n" +
                "cor='" + cor + '\'' + "\n" +
                "modelo='" + modelo + '\'' + "\n" +
                "numeroSerie=" + numeroSerie + "\n" +
                "preco=" + preco + "\n" +
                '}';
    }

    public void calcularValor(){
        if(marca.equalsIgnoreCase("HP")){
            preco *= 1.30;
        } else if(marca.equalsIgnoreCase("IBM")){
            preco *= 1.50;
        }
    }
    public int alterarValor(double valor){
        if(valor > 0){
            preco = valor;
            return 1;
        }
        return 0;
    }
}
