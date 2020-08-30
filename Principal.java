package sistema_compras;

public class Principal {
    public static void main(String[] args) {
        System.out.println("-----------------------Arquivo principal---------------------------------");
        //instanciar objeto 
        Cliente cliente = new Cliente();

        cliente.cpf = 12345;
        cliente.nome = "Giovana Thais";
        cliente.endereco = "Avenida Brasilia";
        cliente.email = "giovana.thais@souunit.com";
        cliente.telefone = 3212321;
        cliente.limiteCompras = 400.30;

        System.out.println("++++++++++++++Dados do Cliente+++++++++++++");
        System.out.println("Nome: "+cliente.nome);
        System.out.println("CPF: "+cliente.cpf);
        System.out.println("Endereço: "+cliente.endereco);
        System.out.println("Email: "+cliente.email);
        System.out.println("Telefone: "+cliente.telefone);
        System.out.println("Limite de Compras: "+cliente.limiteCompras);

        //instanciar objeto 
        Produto produto = new Produto();

        produto.nomeProduto = "biscoito";
        produto.identificador = "biscoito3332";
        produto.disponibilidade = 32;
        produto.marca = "Oreo";
        produto.valor = 5.50;

        System.out.println("------------------------------");
        System.out.println("+++++++Dados do produto++++++");
        System.out.println("Nome do produto: "+produto.nomeProduto);
        System.out.println("Identificador: "+produto.identificador);
        System.out.println("Marca: "+produto.marca);
        System.out.println("Valor: "+produto.valor);
        System.out.println("Disponibilidade: "+produto.disponibilidade);
    }
}