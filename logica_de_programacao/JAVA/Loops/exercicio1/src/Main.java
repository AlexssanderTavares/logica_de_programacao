import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para gerar sua tabuada: ");
        int calcNum = sc.nextInt();

        for(int x = 0; x <= 10; x++){
            int res = calcNum * x;
            System.out.println(calcNum + " x " + x + " = " + res);
        }
    }
}