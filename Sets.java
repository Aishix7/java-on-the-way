import java.util.HashSet;
import java.util.*;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<Integer>(); // not sorted
        // Set<Integer> nums = new TreeSet<Integer>(); //sorted order
        // Collection<Integer> nums = new HashSet<Integer>(); // can use collection interface as well bc all the other methods are inside collections only

        nums.add(6);
        nums.add(5);
        nums.add(2);
        nums.add(1);
        nums.add(6);

        Iterator<Integer> values = nums.iterator();

        while(values.hasNext())
            System.out.println(values.next());

        // for(int n : nums){
        //     System.out.println(n);
        // }
    }
}
