public class Temp {
    public static void main(String [] args){
        B obj = new B(7);
    }
}

class A{
    public A(){
        System.out.println("In A");
    }
    public A(int i){
        System.out.println("In A int");
    }
}
class B extends A{
    public B(){
        System.out.println("In B");
    }

    public B(int i){
        this();
        System.out.println("In B int");
    }
}