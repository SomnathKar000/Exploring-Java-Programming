public class Temp {
    public static void main(String [] args){
        Mobile obj1= new Mobile();
        obj1.price=10000;
        obj1.brand="Samsung";

        Mobile obj2 = new Mobile();
        obj2.price=2000;
        obj2.brand="Nokia";

        obj1.show();
        obj2.show();
        Mobile.view();
        Mobile.show(obj2);
    }
}

class Mobile{
   static String name;
    int price;
    String brand;
    static{
        System.out.println("Static block"); // Called only once
        name="Mobile";
    }
    public Mobile(){
        System.out.println("Constructor"); // Called every time object is created
        price=0;
        brand="NA";
    }

    public void show(){
        System.out.println(name+" : "+brand+" : "+ price );
    }
    public static void view(){
        System.out.println("Viewing");
    }
    public static void show(Mobile obj){
        System.out.println(name+" : "+obj.brand+" : "+ obj.price );
    }
}