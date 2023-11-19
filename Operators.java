public class Operators {
    public static void main(String args[])
    {
        int num1=12;
        int num2=10;
        int num3=num1%num2;
        System.out.println(num3);

        int num=7;
         num++;       // Post Increment
         ++num;     //  Pre Increment
         int result1=(num++);
         System.out.println(result1 + " " + num); //  9   10  
        int result2=(++num);
        System.out.println(result2 + " " + num); //  11  11
        
        float f=8.8f;
        double d=8.8;
        System.out.println(f==d); //false

        
    }
}
