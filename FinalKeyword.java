public class FinalKeyword {
    public static void main(String[] args) {

        final int i ;
        i=10;
        System.out.println(i);
    }
}

class A{
    final void show(){
        System.out.println("Show in A");
    }
    final void show(int a){
        System.out.println("Show in A");
    }
}

final class B {
    final void show(){
        System.out.println("Show in B");
    }
}