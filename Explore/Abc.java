public class Abc {
    public static void main(String[] args) {

    }
}

sealed class A permits B, C {

}

final class B extends A {

}

non-sealed class C extends A {

}

class D {

}