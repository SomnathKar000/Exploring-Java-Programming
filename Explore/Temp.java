public class Temp {
    public static void main(String [] args){
        A obj= new A();
        obj.show(9);
    }
}

class A extends B{
    public void show(){
        System.out.println("In A show");
    }
    public void hide(){
        System.out.println("In A hide");
    }
}
 class  B extends C {
    public void show(){
        System.out.println("In B show");
    }

    public void display(){
        System.out.println("In B display");
    }
}
class C{
    public void show(int a){
        System.out.println("In C show");
    }
    public void display(){
        System.out.println("In C display");
    }
}
