import java.util.ArrayList;

public class Abc {
    public static void main(String[] args) {
        var obj = new ArrayList<>();
        obj.add(2);
        obj.add("sas");

        for (var num : obj) {
            System.out.println(num);
        }
    }
}