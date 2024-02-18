import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Faixa Etária: Receba a idade de uma pessoa e imprima se ela é: menor de idade, adulta ou idosa 
        //(use, por exemplo, 18 para adulta e 60 para idosa).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();
        if (idade < 18) {
            System.out.println("Você é menor de 18 anos!");
            
        }else if (idade >= 60) {
            System.out.println("Você é uma pessoa idosa.");
        }else {
            System.out.println("Você é adulto!");
        }
        scanner.close();
    }
}
