import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter student's first quarter note: ");
        double note1 = scan.nextDouble();
        System.out.print("Enter student's second quarter note: ");
        double note2 = scan.nextDouble();
        System.out.print("Enter student's third quarter note: ");
        double note3 = scan.nextDouble();

        System.out.println("---------------------------------------------------");

        System.out.println("Now choose an operation option: ");
        System.out.println("Enter A for arithmetic average;");
        System.out.println("Enter P for arithmetic weighted;");
        System.out.println("Enter H for harmonic average.");
        System.out.print("Option: ");
        String option = scan.next();

        average(option, note1,note2,note3);


    }
    static void average(String x, double n1, double n2, double n3){
        Scanner scan = new Scanner(System.in);
        if(x.equals("A") || x.equals("a")){
            double arithmeticAverage = (n1 + n2 + n3)/3;
            System.out.println("Arithmetic Average: " + arithmeticAverage);
        }else if(x.equals("P") || x.equals("p")){
            double arithmeticWeighted = ((5*n1) + (3*n2) + (2*n3)) / (5+3+2);
            System.out.println("Arithmetic Weighted: " + arithmeticWeighted);
        }else if(x.equals("H") || x.equals("h")){
            double harmonicAverage = 3 / (1/n1 + 1/n2 + 1/n3);
            System.out.println("Harmonic Average: " + harmonicAverage);
        }else{
            System.out.println("Wrong Entry");
            System.out.print("Try again: ");
            String retry = scan.next();
            average(retry,n1,n2,n3);
        }
    }
}