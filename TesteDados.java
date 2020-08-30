import java.util.Scanner;
public class TesteDados {
    public static void main(String[] args) {
        System.out.println("================");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um texto: ");
        String texto = scanner.nextLine();
        System.out.println("texto descrito foi: "+texto);
        scanner.close();
        int multiplicar = 3*5;
        System.out.println(multiplicar);
    }
}