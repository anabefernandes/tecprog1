import java.util.Scanner;

public class App {
    public static void main(String[] args){
        //Lista de Nomes: Peça ao usuário para inserir 5 nomes (um de cada vez). 
        //Após inserir todos os nomes, peça outro nome e use um loop for para percorrer a lista e verificar se 
        //o 6º(último) nome digitado está presente no array dos 5 nomes informados inicialmente.
        Scanner scanner = new Scanner(System.in);
        String vetorNomes[] = new String[5];
        for(int c = 0; c < vetorNomes.length; c++){
            System.out.println("Insira um nome: ");
            vetorNomes[c] = new Scanner(System.in).nextLine();
        }
        System.out.println("Insira mais 1 nome: ");
        String procurarNome = new Scanner(System.in).nextLine();
        for(int c = 0; c < vetorNomes.length; c++){
            if(vetorNomes[c].equals(procurarNome)){
                System.out.println("Nome ja informado!");
                break;
            }else{
                System.out.println("Esse nome ainda não foi informado.");
                break;
            }
        }
        scanner.close();
    }
}
