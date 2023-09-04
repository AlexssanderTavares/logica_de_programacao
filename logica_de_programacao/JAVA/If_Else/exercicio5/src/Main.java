import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.printf("Digite a primeira nota: ");
        double nota1 = read.nextDouble();

        System.out.printf("Digite a segunda nota: ");
        double nota2 = read.nextDouble();

        double media = nota1 + nota2 / 2;
        System.out.println(media + " é a Media do aluno");

        if(media >= 10.0){
            System.out.println("Aprovado!");
        }else
            System.out.println("Reprovado!");
    }
}