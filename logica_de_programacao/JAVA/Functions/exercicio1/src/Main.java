import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius value: ");
        double radius = scanner.nextDouble();
        //System.out.println("A potencia de " + radius + "elevado a 3 é: " + Math.pow(radius, 3));
        circleVolume(radius);
        }

        static void circleVolume(double x) {
            double volume = (3 * (3.14 * (Math.pow(x, 3))))/4;
            System.out.println(volume);
        }
}
