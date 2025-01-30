import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Temp {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Comparator<Student> com = new Comparator<Student>() {
        // public int compare(Student s1, Student s2) {
        // if (s1.age > s2.age) {
        // return 1;
        // } else {
        // return -1;
        // }
        // }
        // };

        students.add(new Student(12, "Test"));
        students.add(new Student(22, "Demo"));
        students.add(new Student(14, "Okay"));
        students.add(new Student(26, "Done"));
        students.add(new Student(18, "Temp"));

        Collections.sort(students);

        for (Student s : students) {
            System.out.println(s.toString());
        }
    }
}

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Name = " + this.name + " : " + "Age =" + this.age;
    }

    public int compareTo(Student s) {
        if (this.age > s.age) {
            return 1;
        } else {
            return -1;
        }
    }

}