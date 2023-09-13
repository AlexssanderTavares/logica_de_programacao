import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Type a number: ");
        int num1 = read.nextInt();
        System.out.print("Type another number: ");
        int num2 = read.nextInt();
        System.out.print("Type another number: ");
        int num3 = read.nextInt();

        System.out.println("Type order: " + num1 + "," + num2 + "," + num3);
        System.out.println("------------------------------------------------");

        if(num1 > num2 && num1 > num3){
            if(num2 > num3){
                System.out.println("Ascending order: " + num3 + "," + num2 + "," + num1);
                System.out.println("Descending order: " + num1 + "," + num2 + "," + num3);
            }else {
                System.out.println("Ascending order: " + num2 + "," + num3 + "," + num1);
                System.out.println("Descending order: " + num1 + "," + num3 + "," + num2);
            }
        }else if(num2 > num1 && num2 > num3){
            if(num1 > num3){
                System.out.println("Ascending order: " + num3 + "," + num1 + "," + num2);
                System.out.println("Descending order: " + num2 + "," + num1 + "," + num3);
            }else{
                System.out.println("Ascending order: " + num1 + "," + num3 + "," + num2);
                System.out.println("Descending order: " + num2 + "," + num3 + "," + num1);
            }
        }else if(num3 > num1 && num3 > num2){
            if(num1 > num2){
                System.out.println("Ascending order: " + num2 + "," + num1 + "," + num3);
                System.out.println("Descending order: " + num3 + "," + num1 + "," + num2);
            }else{
                System.out.println("Ascending order: " + num1 + "," + num2 + "," + num3);
                System.out.println("Descending order: " + num3 + "," + num2 + "," + num1);
            }
        }
        System.out.println("------------------------------------------------");
    }
}