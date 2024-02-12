package Concepts;
 class Demo {
    public static void main(String[] args) {
        Claculator c=new Claculator();
        System.out.println(c.add(10,20));
        c.num=10;
        System.out.println(c.num);
    }
}
class Claculator{
     int num=10;
    public int add(int num1,int num2) {
        return num1+num2;
    }
}
