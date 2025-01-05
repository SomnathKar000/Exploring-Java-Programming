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
    }
}

class Mobile{
   static String name;
    int price;
    String brand;

    public void show(){
        System.out.println(this.name+" : "+this.brand+" : "+ this.price );
    }
}