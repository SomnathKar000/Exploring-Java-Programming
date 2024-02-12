package Concepts;
class Demo{
    public static void main(String args[]){
        MethodOverloading methods=new MethodOverloading();
        System.out.println(methods.add(4,5));
        System.out.println(methods.add(4,5,5));
        System.out.println(methods.add(4.52,8.35));
    }
}

class MethodOverloading {
    public int add(int num1, int num2){
        return num1+num2;
    }
    public int add(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    public double add(double num1,double num2){
        return num1+num2;
    }
}