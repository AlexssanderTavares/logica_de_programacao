import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual periodo você estuda?");
        System.out.println("M-Matutino");
        System.out.println("V-Vespertino");
        System.out.println("N-Noturno");
        System.out.print("Escolha uma opção: ");
        String periodo = sc.nextLine();

        if(periodo.equals("M") || periodo.equals("m")){
            System.out.println("Bom dia!!!");
        }else if(periodo.equals("V") || periodo.equals("v")){
            System.out.println("Boa tarde!!!");

        }else if(periodo.equals("N") || periodo.equals("n")){
            System.out.println("Boa noite!!!");
        }
    }
}