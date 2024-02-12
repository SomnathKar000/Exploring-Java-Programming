package Concepts;
public class Encapsulation {
    public static void main (String args[]){
        Person person = new Person();
        person.name = "Somnath";
        person.setAge(56);
        System.out.println(person.name+" "+person.getAge());
    }
}

class Person{
    String name;
    private int age;

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age=age;
    }

}