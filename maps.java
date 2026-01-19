import java.util.*;
public class maps {
    public static void main(String[] args) {
        Map<String,Integer> mp = new HashMap<>();
        mp.put("sushil",23);
        mp.put("abhay",65);
        mp.put("diana",100);
        mp.put("arjuna",56);

        System.out.println(mp);
        System.out.println(mp.get("sushil"));

        mp.put("sushil",33);

        System.out.println(mp);

        System.out.println(mp.keySet());

        for(String key : mp.keySet()){
            System.out.println(key + " : " + mp.get(key));
        }

        mp.remove("sushil");

        System.out.println(mp);
    }
}
