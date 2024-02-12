package Concepts;
public class Interface {
    public static void main(String[] args) {
        Laptop lap=new Laptop();
        Desktop desk=new Desktop();
        Developer somnath =new Developer();

        somnath.dev(lap);

        A obj=new A(){
            public void show(){
                System.out.println("Show");
            }
        };
        obj.show();
    }
}

// class Computer{
//     public void code(){

//     }
// }

// abstract class Computer{
//     public abstract void code();
// }

interface Computer{
     void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Code, Complie, Run");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("Code, Complie, Run : Faster");
    }
}



class Developer{
    public void dev(Computer c){
        c.code();
    }
}

interface A{
    void show();
}