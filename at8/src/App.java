import java.util.Scanner;

public class App {
    public static void main(String[] args){
        //Soma dos Números Ímpares: Peça ao usuário que insira um número inteiro n.
        //Calcule e imprima a soma dos primeiros n números ímpares. 
        //Por exemplo, se o usuário inserir 4, o programa deve calcular a soma de 1 + 3 + 5 + 7 = 16.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int n = scanner.nextInt();
        int soma = 0;
        int numImpar = 1;
        for(int i=0; i<n; i++){
            soma = soma+numImpar;
            numImpar = numImpar+2;
        }
        System.out.println("A soma dos "+ n +" primeiros números impares é: "+ soma);

        scanner.close();
    }
    
}
