import java.util.Scanner;

public class At1 {
    public static void main(String[] args){
        //Crie um programa que solicite ao usuário digitar um número.
        //Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        if(numero<0){
            System.out.println("Número negativo!");
        }else {
            System.out.println("Número positivo!");
        }
        scanner.close();                    
    }
}