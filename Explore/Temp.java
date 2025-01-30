import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Temp {
    public static void main(String[] args) {
        List<String> nums = new ArrayList<>();
        Comparator<String> com = new Comparator<String>() {
            public int compare(String a, String b) {
                if (a.length() > b.length()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        nums.add("a");
        nums.add("absd");
        nums.add("as");
        nums.add("skjhd");
        Collections.sort(nums, com);
        System.out.println(nums);
    }
}
