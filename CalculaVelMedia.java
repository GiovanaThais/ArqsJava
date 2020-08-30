import java.util.Scanner;
public class CalculaVelMedia {
    public static void main(String[] args) {
        System.out.println("------VELOCIDADE MÉDIA-------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a distancia percorrida em kilometros: ");
        float km = scanner.nextFloat();
        System.out.println("Velocidade percorrida foi: "+km+" km");
        scanner.close();
        float tempo = 10;
        System.out.println("Tempo gasto foi de: "+tempo+" horas");
        float velocidade = km/tempo;
        System.out.println("A velocidade Média é:"+velocidade+ " km/h");

    }
}