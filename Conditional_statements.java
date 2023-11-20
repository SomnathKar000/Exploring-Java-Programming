class Conditional_statements {
    public static void main(String args[])
    {
        int val1=4,val2=5,val3=7;
        // if(val1>val2 && val1>val3) System.out.println("val1 is greater");
        // else if(val2>val1 && val2>val3) System.out.println("val2 is greater");
        // else System.out.println("val3 is greater");
        if(val1>val2){
            if(val1>val3) System.out.println("val1 is greater");
            else System.out.println("val3 is greater");
        }else{
            if(val2>val3) System.out.println("val2 is greater");
            else System.out.println("val3 is greater");
        }

        int num=3;

        String result="";
        result=num%2==0?"Even":"Odd";

        System.out.println(result);
    }
}

