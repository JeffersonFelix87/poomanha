public class Carro {
    //Definir Atributos
    private int idCarro;
    private String placa;
    private String modelo;
    private String marca;
    private int anoFab;
    private double valor;

    //Métodos modificadores de acesso

    public Carro(){

    }
    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if(modelo.length() >=2){
            this.modelo = modelo;
        }else{
            throw new IllegalArgumentException("Erro: " +
                    "O campo modelo deve ter 2 caracteres ao menos");
        }

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    //Definir os métodos
    public void estacionar() {
        //aqui logica do estacionar
    }

    public void acelerar() {

    }

    public void listar() {
        System.out.println("Id. do Carro:    " + idCarro);
        System.out.println("Placa do Carro:  " + placa);
        System.out.println("Modelo do Carro: " + modelo);
        System.out.println("Valor do Carro: " + valor);
    }


}
