package lab_01;

public class ForLoopWithoutContinue {
    public static void main(String[] args){
        for (int i = 0; i < 50; i++) {
            if (i%2==0){
                System.out.println("Even no -> " + i);
            }
            else {
                System.out.println("Odd no -> " + i);
            }
        }
    }
}
