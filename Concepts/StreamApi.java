package Concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String args[]) {
        System.out.println("Stream api");
        List<Integer> nums = Arrays.asList(1, 3, 5, 7, 2);

        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);

        s2.forEach(n -> System.out.println(n));
    }
}
