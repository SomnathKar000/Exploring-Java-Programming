public class Test {
    public static void main(String args[]){
        A obj= new B();

        B obj2= (B)obj;
        obj2.show();
        obj2.display(); 

    }
}
class A{
    public void show(){
        System.out.println("A show");
    }
    
}
class B extends A{
    public void show(){
        System.out.println("B show");
    }

    public void display(){
        System.out.println("B display");
    }
}