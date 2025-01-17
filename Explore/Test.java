public class Test {
    public static void main(String args[]){
       A obj = new B();
       obj.show();
       obj=new B();
       obj.show();
    }
}

class A{
    public void show(){
        System.out.println("A Show");
    }
}

class B extends A{
    public void show(){
        System.out.println("B Show");
    }
}