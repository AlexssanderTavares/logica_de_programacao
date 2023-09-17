import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a number: ");
        int num = sc.nextInt();
        int sum = 1;
        String sentence = "S = " + sum + " + ";


        for(int x = 2; x <= num; x++){
            String frag = sum + "/" + x;
            String opr = " + ";
            if(x < num){
                frag += opr;
                sentence += frag;
            }else {
                sentence += frag;
            }

            if(x == num){
                System.out.println(sentence);
            }
        }




    }
}
