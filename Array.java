public class Array {
    public static void main(String args[]){
        int arr1[]={1,2,3,3,4};

        int arr2[]=new int[4];
        arr2[0]=5; 
        arr2[1]=6;
        arr2[2]=7;
        arr2[3]=8;

        for(int i=0;i<arr1.length;i++)System.out.println(arr1[i]);

        // Advance for loop 

        for(int n : arr2) System.out.println(n);

        // Multi Dimensional Array

        double random=Math.random();
        // Math.random returns random double value between 0 and 1
        //you can not stort it in int

        int MultiDiArr[][]=new int[3][4];

        for(int i=0;i<MultiDiArr.length;i++){
            for(int j=0;j<MultiDiArr[i].length;j++){
                MultiDiArr[i][j]=(int)(Math.random()*10);
                System.out.print( MultiDiArr[i][j] +" ");
            }
            System.out.println("");
        }

        // Advance for loop

        for(int n[]:MultiDiArr){
            for(int m:n){
                m=(int)(Math.random()*10);
                System.out.print(m+" ");
            }
            System.out.println("");
        }

        int arr3[][]=new int[3][]; // Jagged Array
        
        arr3[0]=new int[2];
        arr3[1]=new int[3];
        arr3[2]=new int[4];

        for(int n[]: arr3){
            for(int m:n){
                m=(int)(Math.random()*10);
                System.out.print(m + " ");
            }
            System.out.println("");
        }

        // Array with objects

        Student s1= new Student();
        s1.roll=1;
        s1.name="Abc";
        s1.marks=87;

        Student s2= new Student();
        s2.roll=2;
        s2.name="Def";
        s2.marks=98;

        Student s3 = new Student();
        s3.roll=3;
        s3.name="Ghi";
        s3.marks=76;

        Student studentArr[]=new Student[3];

        studentArr[0]=s1;
        studentArr[1]=s2;
        studentArr[2]=s3;

        for(Student s: studentArr){
            System.out.println(s.roll+ ":" + s.name +":"+s.marks);
        }
        
    }
}


class Student{
    int roll;
    String name;
    byte marks;
}