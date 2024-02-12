package Concepts;
public class Data_types {
    public static void main (String args[]){
        double d=75.36;
        float f=73.36f;

        int a=10;
        byte by =122;
        long l=12456;
        short sh=1234;
        int binary=0b010;

        char c='a';
        String b="hello";
        
        boolean e=true;

        System.out.println(d);
        System.out.println(f);

        System.out.println(a);
        System.out.println(by);
        System.out.println(l);
        System.out.println(sh);
        System.out.println(binary);
        
        System.out.println(c);
        System.out.println(b);
        
        System.out.println(e);

        byte bi=126;
        int in=123;
        in=bi;
        bi=(byte)in;
        System.out.println(bi);

        byte t1=10;
        byte t2=30;
        int t3=t1*t2;
        System.out.println(t3);
    }
}
