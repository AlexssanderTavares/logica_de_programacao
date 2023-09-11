import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o preço da Skol: ");
        double skol = sc.nextDouble();
        System.out.print("Qual o preço da Kaiser: ");
        double kaiser = sc.nextDouble();
        System.out.print("Qual o preço da Heineken: ");
        double heineken = sc.nextDouble();

        System.out.println("Preço da skol: " + skol);
        System.out.println("Preço da kaiser: " + kaiser);
        System.out.println("Preço da heineken: " + heineken);

        if (skol < kaiser && skol < heineken){
            System.out.println("Skol é a mais barata!");
        }else if(kaiser < skol && kaiser < heineken){
            System.out.println("Kaiser é a mais barata");
        }else if(heineken < kaiser && heineken < skol){
            System.out.println("Heineken é a mais barata");
        }
    }
}