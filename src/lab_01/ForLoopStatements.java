package lab_01;

public class ForLoopStatements {
    public static void main (String[] args){
        for (int i = 0; i < 50; i++) {
            if(i%2==0){
                System.out.println("Even no->"+ i);
                continue;
            }
            System.out.println("Odd no ->" + i);
        }
    }
}
