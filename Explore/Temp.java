public class Temp {
    public static void main(String [] args){
        Mobile obj1= new Mobile();
        obj1.price=10000;
        obj1.brand="Samsung";

        Mobile obj2 = new Mobile();
        obj2.price=2000;
        obj2.brand="Nokia";

        Mobile.name="Smartphone";
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