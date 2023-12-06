public class MethodOverriding {
    public static void main(String args[]){
        B b = new B();
        b.show();
        b.config();
    }
}

class A{
    public void show(){
        System.out.println("Show in A");
    }
    public void config(){
        System.out.println("Config in A");
    }
}

class B extends A{
    public void show(){
        System.out.println("Show in B");
    }
    
}