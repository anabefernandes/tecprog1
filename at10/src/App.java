import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Senha Secreta: Defina uma senha secreta (por exemplo: "Java123"). 
        //Use um loop while para pedir ao usuário que insira a senha. 
        //Se a senha estiver incorreta, continue pedindo a senha e informe ao usuário que a tentativa foi inválida. 
        //Se ele acertar, saia do loop e imprima uma mensagem de sucesso

        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "java123";
        String entrada;
        do{
            System.out.println("Insira a senha correta: ");
            entrada = scanner.nextLine();
            if (!entrada.equals(senhaCorreta)) {
                System.out.println("Senha incorreta! Tente novamente.");            
            }
            }while (!entrada.equals(senhaCorreta));
        System.out.println("Parabens! Senha correta.");
        scanner.close();
    }
}
