public class MultipleInheritance {
    public static void main(String[] args) {
        new C();
    }
}

class A{
    A(){
        System.out.println("A in");
    }
}

class B extends A {
    B(){
        System.out.println("B in");
    }
}

class C extends B {
    C(){
        System.out.println("C in");
    }
}