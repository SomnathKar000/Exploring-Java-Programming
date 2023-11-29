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
    }
}
class Mobile{
    String name;
    int Price;
    static String OS="Android";

    public void view(){
        System.out.println("Name: "+name+" , Price: "+Price+" , OS: "+OS);
    }
}
