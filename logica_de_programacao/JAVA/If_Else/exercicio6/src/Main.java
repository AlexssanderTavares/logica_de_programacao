import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.printf("Digite um número: ");
        int num1 = read.nextInt();

        System.out.printf("Digite o segundo número: ");
        int num2 = read.nextInt();

        System.out.printf("Digite o terceiro número: ");
        int num3 = read.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " é o maior!");
        }else if(num2 > num1 && num2 > num3){
            System.out.println(num2 + " é o maior!");
        }else if(num3 > num1 && num1 > num2){
            System.out.println(num3 + " é o maior!");
        }
    }
}