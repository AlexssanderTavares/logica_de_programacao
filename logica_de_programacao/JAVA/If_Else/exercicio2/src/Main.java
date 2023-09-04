import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        int num = read.nextInt();

        if(num < 0){
            System.out.println("O número é negativo!");

        }else if(num > 0){
            System.out.println("O número é positivo!");
        }else{
            System.out.println("0 é nulo!");
        }
    }
}