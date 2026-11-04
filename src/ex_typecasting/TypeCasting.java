package ex_typecasting;

public class TypeCasting {

    public static void main(String[] args){
//        Narrowing
        int a= 10;
        byte b = (byte)a;

        System.out.println(b);

//        Widening
        char t =  '1';
        int f = (int) t;

        System.out.println(f);

    }
}