import java.util.Scanner;

public class TypeCasting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);


        //Type casting
//        int num = (int)(67.56f);
//        System.out.println(num);

        //automatic type promotion in expression
//        int a = 258;
//        byte b = (byte) (a); // 258 % 256 = 2
        //here the byte will store only 256 if in case you add more then 256 it will give the reminder of the of your number

//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;

//        System.out.println(d);


//        byte b = 50;
//        b = b * 2;

//        int number = 'A';
//        System.out.println(number);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d-s);
        //float + int - double = double
        System.out.println((f * b) + " " +(i / c) +" " +(d -s));
        System.out.println(result);






    }
}
