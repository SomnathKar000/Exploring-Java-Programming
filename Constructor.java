class Demo{
    public static void main (String args[]){
        Person person1 = new Person();
        Person person2=new Person("Somnath",123);
        
        person1.setId(123);
        person2.setId(456);

        System.out.println(person1.getId()+" "+ person1.name+" "+person1.age);
        System.out.println(person2.getId()+" "+ person2.name+" "+person2.age);
    }
}

class Person{
    int age;
    String name;
    private int id;
    Person(){
        this.name="Default";
        this.age=18;
    }

    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return this.id;
    }
}
