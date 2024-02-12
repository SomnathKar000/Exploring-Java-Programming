package Concepts;
import java.util.*;


public class Inheritance {
    public static void main( String args[]){
        AdvanceCalCulator calc= new AdvanceCalCulator();
        System.out.println(calc.add(10,20));
    }
}

 class MultiAdvanceCalculator extends AdvanceCalCulator{
    public double pow (int a, int b){
        return Math.pow(a, b);
    }
}