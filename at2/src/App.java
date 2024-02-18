import java.util.Scanner;

public class App {
    public static void main(String[] args){
        //Peça ao usuário para inserir dois números inteiros.
        //Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int n1 = scanner.nextInt();
		System.out.println("Digite outro número inteiro: ");
		int n2 = scanner.nextInt();
		if(n1==n2) {
			System.out.println("Os números são iguais!");			
		}else if(n1 > n2) {
			System.out.println("Números diferentes. O primeiro número é maior que o segundo.");
		}else {
			System.out.println("Números diferentes. O segundo número é maior que o primeiro.");
		}
	scanner.close();
	}
}