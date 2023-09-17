import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter time in seconds: ");
        int seconds = scan.nextInt();

        timer(seconds);
        }

        static void timer(int x) {
            int second = x % 60;
            int minutes = (x / 60) % 60;
            int hour = ((x/60)/60) % 60;

            System.out.println("Duration time: " + hour + ":" + minutes + ":" + second + "s");
        }
    }