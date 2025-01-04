public class New {
    public static void main(String[] args){
        int a=10;
        // System.out.println(a%2==0?"Even ":"Odd");
        // for(int i=0;i<a;i++){
        //     System.out.println("Current No is :- "+i);
        // }
        // while(a>0){
        //     System.out.println("The current no is :- "+a);
        //     a--;
        // }
        // do{
        //     System.out.println("The current no is :- "+a);
        //     a--;
        // }while(a>0);
        // Calculator obj= new Calculator();
        int sum=Calculator.sum(10,20);
        System.out.println(sum);

    }
}

class Calculator{
     static int sum(int num1,int num2){
        return num1+num2;
    }
}