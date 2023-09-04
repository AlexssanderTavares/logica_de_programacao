import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.printf("Digite uma letra: ");
        String letra = read.next();

        if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")
                || letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")){
            System.out.println("Vogal!");
        }else{
            System.out.println("Consoante!");
        }
    }
}