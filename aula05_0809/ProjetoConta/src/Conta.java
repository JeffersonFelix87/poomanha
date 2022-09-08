public class Conta {
    private String numConta;
    private String agencia;
    private double saldo;
    private String nomeCliente;

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int sacar(double valor){
        if(valor<=saldo){
            saldo -= valor;
            return 1;
        }
        return 0;
    }
    public void depositar(double valor){
        saldo += valor;
    }

    @Override
    public String toString() {
        return "Dados da conta: " + numConta + "\n" +
                "Nome Cliente: " + nomeCliente + "\n" +
                "Saldo: " + saldo + "\n";
    }
}
