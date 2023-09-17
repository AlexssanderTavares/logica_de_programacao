import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter value of A: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter value of B: ");
        double num2 = scan.nextDouble();
        System.out.print("Enter value of C: ");
        double num3 = scan.nextDouble();

        bhaskara(num1,num2,num3);
        }
        static void bhaskara(double a, double b, double c){
            double x = -b + (Math.sqrt(((b*b-4) * (a*c)) / (2*a)));
            double y = -b - (Math.sqrt(((b*b-4) * (a*c)) / (2*a)));
            System.out.println("X = " + x + " | Y = " + y);
        }
}