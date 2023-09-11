import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int num2 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                System.out.println(num1 + "," + num2 + "," + num3);
            } else if (num3 > num2) {
                System.out.println(num1 + "," + num3 + "," + num2);
            }
        }
        if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                System.out.println(num2 + "," + num1 + "," + num3);
            } else if (num3 > num1) {
                System.out.println(num2 + "," + num3 + "," + num1);
            }
        }

        if (num3 > num1 && num3 > num2) {
            if (num1 > num2) {
                System.out.println(num3 + "," + num1 + "," + num2);
            } else if (num2 > num1) {
                System.out.println(num3 + "," + num2 + "," + num1);
            }
        }
    }
}