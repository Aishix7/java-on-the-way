import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(7);
        System.out.println(nums.indexOf(6));
        System.out.println(nums.get(2));

    }
}
