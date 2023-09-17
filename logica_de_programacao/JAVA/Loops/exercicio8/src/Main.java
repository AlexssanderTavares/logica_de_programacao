
public class Main {
    public static void main(String[] args) {
        /*
        A company of theater wish to make a series of shows
            a)The direction calculates ticket price as R$ 5,00
            b)120 tickets will be sold, and expenses will be R$ 200,00
            c)Reducing price of the tickets in R$ 0,50 in hope for growing sales in 26 tickets.
         */

        double ticket = 5.00;
        int total = 120;

        while(ticket > 1){
            double profit = (ticket * total) - 200.00;
            System.out.println("|Buy price: " + ticket + " |Total of units sold: " + total + " |Profit: " + profit + " |");
            ticket = ticket - 0.5;
            total = total + 26;
        }
    }
}