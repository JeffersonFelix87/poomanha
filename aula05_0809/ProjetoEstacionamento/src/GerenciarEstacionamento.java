public class GerenciarEstacionamento {
    public static void main(String[] args) {
        //Tres carros para um cliente
        Cliente cliente = new Cliente();
        cliente.setIdCliente(1);
        cliente.setNome("Joao Carlos");
        cliente.setTipoPagamento("Mensal");
        //instanciar e definir tres carros
        Carro carro1 = new Carro();
        carro1.setPlaca("HHH-0001");
        carro1.setMarca("Fiat");
        carro1.setModelo("Uno");
        carro1.setAno(1988);
        Carro carro2 = new Carro();
        carro2.setPlaca("HHH-0002");
        carro2.setMarca("Nissan");
        carro2.setModelo("Frontier");
        carro2.setAno(2018);
        Carro carro3 = new Carro();
        carro3.setPlaca("HHH-0003");
        carro3.setMarca("VW");
        carro3.setModelo("Fusca");
        carro3.setAno(1969);
        //Definindo o proprietario joao como sendo o dono
        cliente.adicionarCarro(carro1);
        cliente.adicionarCarro(carro2);
        cliente.adicionarCarro(carro3);
        System.out.println(cliente);

    }
}