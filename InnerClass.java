public class InnerClass {
    public static void main(String[] args) {
        A obj =new A();
        obj.show();

        A.B objB= new A().new B();// or A.B objB = obj.new B();
        objB.config();

        A.B.C objC=new A().new B().new C(); // or A.B.C objC= objB.new C();
        objC.show();

        // Static class 

        A.StaticD objD=new A.StaticD(); // this works only with static classes

        objD.show();

        
    }
}

class A{
    int val;

    static class StaticD{
        public void show(){
            System.out.println("in static show");
        }
    }

    public void show(){
        System.out.println("in show");
    }

    class B{
        public void config(){
            System.out.println("in config");
        }

        class C{
            public void show(){
                System.out.println("in class C show");
            }
        }
    }

}