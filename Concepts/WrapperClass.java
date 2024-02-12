package Concepts;
public class WrapperClass{
    public static void main(String args[]){
        int num=10;
        // Integer num1= new Integer(num); // Boxing 
        Integer num2= num; // Auto Boxing

        int num3=num2.intValue(); // unBoxing 

        int num4=num; // auto unBoxing

        System.out.println(num2+" "+num3);
    }
}