public class This_and_Super_Method {
    public static void main(String[] args) {
        B obj =new B(5);

    }
}

class B extends A{
    B(){
        super(5);
        System.out.println("B in");
    }
    B(int a){
        
        this();
        System.out.println("B in int");
    }
}

class A{
    A(){
        System.out.println("A in");
    }
    A(int a){
        System.out.println("A in int");
    }
}