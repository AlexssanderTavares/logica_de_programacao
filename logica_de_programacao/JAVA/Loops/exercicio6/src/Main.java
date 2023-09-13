import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random clients = new Random();
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the number of customers that buyed: ");
        int projClients = read.nextInt();

        int qtClients = clients.nextInt(projClients);
        int i = 0;
        double accumulated = 0;

        while(i < qtClients){
            System.out.print("Enter the customer's number: " + i +  " purchase total: ");
            double purchase = read.nextDouble();
            accumulated = accumulated + purchase;
            i++;
        }
        if(accumulated > 54000){
            System.out.println("Goal Beat");
            System.out.println(accumulated - 54000 + "Surpassed");
        }else{
            System.out.println("Goal not reached!");
            System.out.println(54000 - accumulated + "Pending");
        }
    }
}