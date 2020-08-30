public class ExemploVetor {
    public static void main(String[] args) {
        System.out.println("===========");
        double[] precoProduto = new double[]{150,20,10,100.2};
        double preco = precoProduto[1];
        System.out.println("o preco do segundo produto é:"+preco);
        precoProduto[1] = 22;
        System.out.println("produto com valor alterado para: "+ precoProduto[1]);


    }
}