package Concepts;
public class Calculator{
    public int add(int num1,int num2){
        return num1+num2;
    }
    public int sub(int num1,int num2){
        return num1-num2;
    }
    public int mul(int num1,int num2){
        return num1*num2;
    }
    public double div(double num1,double num2){
        return num1/num2;
    }
}

class Demo {
    public static void main(String args[]){
        int num1=10;
        int num2=15;
        Calculator cal =new Calculator();
        double result=cal.div(num1, num2);
        System.out.println(result);
    }
}

