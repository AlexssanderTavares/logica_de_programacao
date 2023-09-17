import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        prime(num);

    }
    static void prime(int x){
        boolean is_true = x % 2 == 0;
        System.out.println("Prime? " + is_true);
        }
    }
