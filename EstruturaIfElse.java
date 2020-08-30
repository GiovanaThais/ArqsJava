public class EstruturaIfElse {
    public static void main(String[] args) {
        int idade=17;
        String sexo="h";

        if(idade>=18){
            System.out.println("Idade impropria\n");
        }
        else if(sexo == "f"){
            System.out.println("Sexo diferente do esperado\n");
        }
        else{
            System.out.println("idade > 18 e sexo masculino");
        }
        
    }
}