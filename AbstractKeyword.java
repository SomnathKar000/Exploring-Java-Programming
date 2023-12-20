public class AbstractKeyword{

    public static void main(String main[]){
        // You cannot create an object of abstract class
        // Car car= new Car(); // Error
        Car bmwObj= new UpdatedBMW();
        bmwObj.drive();

        Car audiObj= new Audi();
        audiObj.drive();
    }
}

abstract class Car{
    // Abstract class
    // Abstract method access modifier can be public or protected
    protected abstract void start();
    public abstract void stop();
    public abstract void drive();
    
    public void playMusic(){
        System.out.println("Playing Music");
    }
}

class Audi extends Car{ // Concrete class
    protected void start(){
        System.out.println("Audi start");
    }
    public void stop(){
        System.out.println("Audi stop");
    }
    public void drive(){
        System.out.println("Audi drive");
    }
}

abstract class BMW extends Car{
    public void start(){
        System.out.println("BMD start");
    }
    public void stop(){
        System.out.println("BMD stop");
    }
}

class UpdatedBMW extends BMW{ // Concrete class
    public void drive(){
        System.out.println("BMD drive");
    }
}