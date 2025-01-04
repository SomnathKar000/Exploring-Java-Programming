public class New {
    public static void main(String[] args){
        int a=10;
        System.out.println(a%2==0?"Even ":"Odd");
        for(int i=0;i<a;i++){
            System.out.println("Current No is :- "+i);
        }
        while(a>0){
            System.out.println("The current no is :- "+a);
            a--;
        }
        do{
            System.out.println("The current no is :- "+a);
            a--;
        }while(a>0);


    }
}