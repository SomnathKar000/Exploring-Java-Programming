package Concepts;
class StaticVariable {
    public static void main(String args[]){
        Mobile m1=new Mobile();
        m1.name="Samsung";
        m1.Price=10000;
        Mobile.OS="Android";

        Mobile m2=new Mobile();
        m2.name="Apple";
        m2.Price=20000;
        Mobile.OS="IOS";

        m1.view();
        m2.view();
        Mobile.staticView();
        Mobile.staticViewRefference(m1);
        Mobile.staticViewRefference(m2);
    }
}
class Mobile{
    String name;
    int Price;
    static String OS="Android";

    public void view(){
        System.out.println("Name: "+name+" , Price: "+Price );
    }
    public static void staticView(){
        System.out.println("The static value is: "+OS);
    }
    public static void staticViewRefference(Mobile obj){
        System.out.println("The refference of the Mobile is: "+"Name: "+obj.name+" , Price: "+obj.Price );
    }
}
