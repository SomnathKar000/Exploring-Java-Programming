public class UpcastingandDowncasting {
    public static void main(String[] args) {
        // A obj = new B();
        // obj.show1(); // Upcasting becase the object is created using B but the type is A

        // B obj1= (B) obj; // Downcasting 
        // obj1.show2();
    }
}

class A
{
    public void show1(){
        System.out.println("The show1 method is called");
    }
}

class B extends A
{
    public void show2(){
        System.out.println("The show2 method is called");
    }
}