import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para gerar a tabuada: ");
        int numero = scanner.nextInt();
        for (int c=1; c<=10; c++){
            int formula = numero * c;
            System.out.println(numero + " x " + c + " = " + formula);
        }
        scanner.close();
      } 
    }
