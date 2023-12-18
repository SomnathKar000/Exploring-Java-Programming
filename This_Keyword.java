public class This_Keyword{
    public static void main(String[] args) {
        Demo obj= new Demo();
        obj.setAge(60, obj);
        obj.setAge(6);
        obj.display();
        
    }

    
}

class Demo{
    private int age=100;
    public void display(){
        System.out.println("The age is "+age);
    }
    public void setAge(int val,Demo obj){
        obj.age=val;
    }
    public void setAge(int age){
        this.age=age;
        
    }
}