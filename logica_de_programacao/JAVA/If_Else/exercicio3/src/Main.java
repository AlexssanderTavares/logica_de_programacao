import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.printf("Qual o seu sexo? M/F ");
        String sex = read.next();

        if(sex.equals("M") || sex.equals("m")){
            System.out.println("M - Masculino");

        }else if(sex.equals("F") || sex.equals("f")){
            System.out.println("F - Feminino");
        }else{
            System.out.println("Entrada inválida!");
        }
    }
}