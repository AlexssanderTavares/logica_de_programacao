
public class Main {
    public static void main(String[] args) {
        for(int num = 0; num <= 1000; num++){
            if(num / 11 == 2){
                System.out.println("Numbers with remnant 2: " + num);
            }
        }
        System.out.println("-----------------");
        for(int num = 0; num <= 2000; num++){
            if(num / 11 == 2){
                System.out.println("Numbers with remnant 2: " + num);
            }
        }
    }
}