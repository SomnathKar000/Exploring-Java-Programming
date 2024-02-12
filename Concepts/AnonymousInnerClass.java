package Concepts;
public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj =new A(){
            public void show(){
                System.err.println("In new show");
            }
        };// Anonymous Inner Class
        obj.show();

        AbstractClass obj2=new AbstractClass(){
            public void show(){
                System.out.println("In new show");
            }
        };
        obj2.show();
    }
}
class A{
    public void show() {
        System.out.println("In show");
    }
}
abstract class AbstractClass{
    abstract void show();
}