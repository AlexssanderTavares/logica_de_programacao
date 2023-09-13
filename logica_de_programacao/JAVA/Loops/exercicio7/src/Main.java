import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter customer's purchase value: ");
        double purchase = read.nextDouble();

        if(purchase >= 500){
            System.out.println("Purchased   -   Discount    -   Total");
            for(double percent = 0; percent <= 25; percent++){
                double discountValue = purchase * (percent/100);
                double total = purchase - discountValue;
                System.out.println(purchase + "     -       " + percent + "     -       " + total);
                purchase += 100;
            }
        }else{
            System.out.println("There is no discount for purchases below R$ 500,00");
            System.out.println("Your purchase: R$ " + purchase);
        }
    }
}