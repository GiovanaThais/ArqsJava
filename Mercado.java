import java.util.Scanner;
public class Mercado {
    public static void main(String[] args) {
        System.out.println("===========================");
        System.out.println ("Informe o valor do produto para cadastro de cupom de desconto: ");
        Scanner scanner = new Scanner(System.in);
        double preco = scanner.nextDouble();
        scanner.close();
        boolean produtoAltoValor = preco >= 100;
        double percentualDesconto = 0.0;
        if (produtoAltoValor) {
            percentualDesconto = 5.0;
        } else { 
            System.out.println("Não será aplicado cupom de desconto.");
        }
        double desconto = (preco * percentualDesconto) / 100;
        double precoComDesconto = preco - desconto;
        System.out.println("O produto sairá por R$"+ precoComDesconto);
        System.out.println("Fim!");
}
}