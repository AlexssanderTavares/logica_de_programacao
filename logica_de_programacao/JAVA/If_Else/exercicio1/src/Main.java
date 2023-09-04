import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.printf("Insira um número: ");
        int num1 = read.nextInt();
        System.out.printf("Insira mais um número: ");
        int num2 = read.nextInt();

        if(num1 > num2){
            System.out.println("O numero maior é: " + num1);

        }else if(num2 > num1){
            System.out.println("O numero maior é: " + num2);
        }

    }
}
