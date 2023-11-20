public class Loops {
    public static void main (String args[]){
        int n=5;

        System.out.println("for loop");
        // In for loop, these two statements are executed first: int i = 1; i <= n;
        // Then the block of code is executed, and then the i++ is executed.
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }

        System.out.println("for loop with semicolon");
        int z=1;
        for(;z<=5;){// You have to use semicolon
            System.out.println(z);
            z++;
        }


        System.out.println("while loop");
        int i=1;
        while(i<=n){
            System.out.println(i);
            i++;
        }


        System.out.println("do while loop");
        do{
            System.out.println(i-n);
            n--;
        }
        while(n>0);


        System.out.println("nested while loop");
        while(n<10){
            int j=0;
            while(j<10){
                System.out.println(""+n+j);
                j++;
            }
            n++;
        }


        System.out.println("nested for loop");
        for(int k=0;k<10;k++){
            for(int j=0;j<10;j++){
                System.out.println(""+k+j);
            }
        }
        
    }
}
