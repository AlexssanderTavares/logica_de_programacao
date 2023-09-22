import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter employee's month total work time: ");
        int totalWorkTime = scan.nextInt();

        System.out.print("Enter the price for each hour worked: ");
        int price = scan.nextInt();

        paymentCalc(totalWorkTime, price);

    }
    static void paymentCalc(int twt, int p){
        double bruteWage = (double) p * twt;
        if(bruteWage <= 900.00){
            double discINSS = bruteWage * 0.1;
            double fgts = bruteWage * 0.11;
            double totalDisc = discINSS;
            double liqWage = bruteWage - totalDisc;
            System.out.println("Brute Wage : " + bruteWage);
            System.out.println("IR: FREE");
            System.out.println("INSS: -" + discINSS);
            System.out.println("FGTS: " + fgts);
            System.out.println("Total discounts: " + totalDisc);
            System.out.println("Liquid Wage: " + liqWage);
        }else if(bruteWage <= 1500.00 && bruteWage > 900.00){
            double incomeTax = bruteWage * 0.05;
            double discINSS = bruteWage * 0.1;
            double fgts = bruteWage * 0.11;
            double totalDisc = discINSS + incomeTax;
            double liqWage = bruteWage - totalDisc;
            System.out.println("Brute Wage : " + bruteWage);
            System.out.println("IR: -" + incomeTax);
            System.out.println("INSS: -" + discINSS);
            System.out.println("FGTS: " + fgts);
            System.out.println("Total discounts: " + totalDisc);
            System.out.println("Liquid Wage: " + liqWage);
        }else if(bruteWage <= 2500.00 && bruteWage > 1500.00){
            double incomeTax = bruteWage * 0.1;
            double discINSS = bruteWage * 0.1;
            double fgts = bruteWage * 0.11;
            double totalDisc = discINSS + incomeTax;
            double liqWage = bruteWage - totalDisc;
            System.out.println("Brute Wage : " + bruteWage);
            System.out.println("IR: -" + incomeTax);
            System.out.println("INSS: -" + discINSS);
            System.out.println("FGTS: " + fgts);
            System.out.println("Total discounts: " + totalDisc);
            System.out.println("Liquid Wage: " + liqWage);
        }else if(bruteWage > 2500.00){
            double incomeTax = bruteWage * 0.2;
            double discINSS = bruteWage * 0.1;
            double fgts = bruteWage * 0.11;
            double totalDisc = discINSS + incomeTax;
            double liqWage = bruteWage - totalDisc;
            System.out.println("Brute Wage : " + bruteWage);
            System.out.println("IR: -" + incomeTax);
            System.out.println("INSS: -" + discINSS);
            System.out.println("FGTS: " + fgts);
            System.out.println("Total discounts: " + totalDisc);
            System.out.println("Liquid Wage: " + liqWage);
        }


    }
}