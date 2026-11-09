package lab_01;

public class ForLoop01 {
    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {
            if (i%2==0){
                System.out.println("EVEN NO -> "+ i);
                continue;
            }
            System.out.println("Number -> "+ i);
        }
    }
}
