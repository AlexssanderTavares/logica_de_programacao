
public class Main {
    public static void main(String[] args) {
        int num = 1;
        while(num <= 10){
            for(int x = 0; x <= 10; x++){
                int res = num * x;
                System.out.println(num + " x " + x + " = " + res);
                if(x == 10){
                    System.out.println();
                }
            }
            num++;
        }
    }
}