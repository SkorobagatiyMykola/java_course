package ua.skorobahatyi.lesson_1;

public class OverflowPrimitive {
    public static void main(String[] args) {
        byte a1=127,b1;
        b1= (byte) (a1+1);
        System.out.println(b1);

        System.out.println(a1+1);

        int a2=Integer.MAX_VALUE;

        System.out.println(a2);
        System.out.println(a2+1);

        double d1=Double.MAX_VALUE,d2;
        d2=d1*2;
        System.out.println(d2);

        double d3=Double.MIN_VALUE;
        System.out.println(d3);

        System.out.println("===================");
        double r1=d1+1;
        double r2=d2-1;
        System.out.println(r1);
        System.out.println(r2);

        Long l=Long.MAX_VALUE;
    }
}
