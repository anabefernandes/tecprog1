import java.util.Scanner;
public class App {
    public static void main(String[] args){
        //Crie um menu que oferece duas opções ao usuário:
        // "1. Calcular área do quadrado" e "2. Calcular área do círculo".
        // Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Calcular a area do quadrado.");
        System.out.println("2.Calcular a area do circulo.");
        System.out.println("Escolha 1 ou 2");
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("Digite o lado do quadrado: ");
                double lado = scanner.nextDouble();
                double areaDoQuadrado = calcularAreaQuadrado(lado);
                System.out.println("A area do quadrado é: "+ areaDoQuadrado);            
                break;
            case 2:
                System.out.println("Digite o raio do circulo: ");
                double raio = scanner.nextDouble();
                double raioDoQuadrado = calcularAreaCirculo(raio);
                System.out.println("A area do circulo é: "+raioDoQuadrado);
                break;        
            default:
                System.out.println("Opção inválida. Escolha 1 ou 2!");
                break;
        }
        scanner.close();
    }
    private static double calcularAreaQuadrado(double lado){
        return lado*lado;
    }
    private static double calcularAreaCirculo(double raio){
        return Math.PI*raio*raio;
    }
}
