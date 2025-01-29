package Concepts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionClasses {
    public static void main(String args[]) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(78);
        numbers.add(5);
        numbers.add(6);
        numbers.add(5);

        // for (int num : numbers) {
        // System.out.println(num);
        // }
        System.out.println(numbers.indexOf(8));
    }
}
