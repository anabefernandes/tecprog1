import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     //Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
      Scanner scanner = new Scanner(System.in);
      System.out.println("Digite um número: ");
      int numero = scanner.nextInt();
      int resultado = numero;
      while (numero>1) {
        resultado = resultado * (numero-1);
        numero--;
        System.out.println(resultado);
      }
      scanner.close();
    }
}
