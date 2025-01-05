public class Temp {
    public static void main(String [] args){
        Car obj = new Car();
        obj.setColor("Red");
        obj.print();
    }
}

class Car{
    private String color;

    public void print(){
        System.out.println("Car color is: " + color);
    }
    public void setColor(String color){
        this.color = color;
    }
}