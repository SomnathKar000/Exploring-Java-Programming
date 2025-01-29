package Concepts;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CollectionClasses {
    public static void main(String args[]) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(2, "sds");
        map.put(9, "haha");
        System.out.println(map.get(9));
        System.out.println(map);
    }
}
