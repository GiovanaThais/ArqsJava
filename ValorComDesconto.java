import java.util.Scanner;
public class ValorComDesconto {
    public static void main(String[] args) {
        int idadeMinima = 18;
        double preco = 115;
        System.out.println("Valor do produto sem desconto: R$"+preco);
        double percentualDesconto = 5.0;
        System.out.println("Com um desconto de "+percentualDesconto+"%");
        double desconto = preco*percentualDesconto/100;
        double precoComDesconto = preco - desconto;
        System.out.println("Com desconto o preço sai por R$"+precoComDesconto);
        System.out.println("Para confirmar compra digite sua idade(importante que seja de maior");
        Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt();
        scanner.close();
        if (idade < idadeMinima){ 
            System.out.println("Compra não efetuada");
        } else if (idade >= idadeMinima){
            System.out.println("Compra efetuada com sucesso");
        }

    }
}