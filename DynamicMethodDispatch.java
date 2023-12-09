public class DynamicMethodDispatch {
    public static void main (String args[]){
        A obj =new B();
        obj.show(); 

        obj =new A();
        obj.show();

        obj =new C();
        obj.show();
    }
}

class A {
    protected void show() {
        System.out.println("From A");
    }
}


class B extends A{
    protected void show() {
        System.out.println("From B");
    }

    protected void config() {
        System.out.println("Config B");
    }
}

class C extends B{
    protected void show() {
        System.out.println("From C");
    }
}