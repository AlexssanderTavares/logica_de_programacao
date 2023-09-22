import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] names = new String[16];
        int[] ages = new int[16];

        ages[0] = 0;
        names[0] = null;

        for(int i = 1; i <= 15; i++){
            System.out.print("Enter complete name of people number["+i+"]: ");
            names[i] = scan.next();
            System.out.println("-----------------------------------");
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = scan.nextInt();
            System.out.println("-----------------------------------");
            }
        }

    }
}