package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {

    public static void main(String[] args) {

        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};

        Map<String, Integer> map = new HashMap();

        for(int i = 0; i < clothes.length; i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) +1);
        }

        Integer answer = 1;

        for(Integer i: map.values()){
            System.out.println(i);
            answer *= (i+1);
        }

    }
}
