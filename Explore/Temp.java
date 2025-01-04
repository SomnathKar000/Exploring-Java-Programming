public class Temp {
    public static void main(String [] args){
        Student s1=new Student();
        s1.id=1;
        s1.name="John";
        s1.age=20;

        Student s2= new Student(2,"Doe",21);
        Student s3= new Student(3,"Jane",22);

        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(Student obj :students){
            System.out.println(obj.id+ " "+obj.name+" "+obj.age);
        }
    }
}

class Student{
    int id;
    String name;
    int age;
    Student(){}
    Student(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
}