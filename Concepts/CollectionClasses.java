package Concepts;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CollectionClasses {
    public static void main(String args[]) {
        HashMap<Integer> set = new HashSet<Integer>();
        set.add(34);
        set.add(78);
        set.add(34);
        System.out.println(set.contains(3));
    }
}
