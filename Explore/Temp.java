import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Temp {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                if ((a % 10) > (b % 10)) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        nums.add(23);
        nums.add(71);
        nums.add(35);
        nums.add(17);
        Collections.sort(nums, com);
        System.out.println(nums);
    }
}
