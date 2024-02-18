import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Crie um programa que solicite ao usuário a entrada de um número inteiro. 
        //Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        if(numero % 2 == 0){
            System.out.println("O numero é par!");
        } else {
            System.out.println("O numero é impar");
        }
        scanner.close();
    }
}
