package Concepts;
public class StaticBlock {
    public static void main(String args[]){
        System.out.println(new Mob().id);
    }
}

class Mob{
    static String name;
    int id;
    static{
        name="Mob";
        System.out.println("Static block");
    }
    public Mob(){
        System.out.println("Constructor");
    }
}