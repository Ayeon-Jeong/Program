package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Solution2 {


    public static void main(String[] args) {

        String[] phone = { "119", "97674223", "1195524421", "1" };


        Map map = new HashMap();

        int i = 0;
        for(String p: phone) {
            map.put(p, i++);

        }

        Iterator<String> keys = map.keySet().iterator();

//        while( keys.hasNext() ){
//            String key = keys.next();
//            for(int j = 1; j < key.length(); j++) {
//                String tmp = key.substring(0, j);
//                if (map.containsKey(tmp)) {
//                    System.out.println("false");
//                }
//            }
//        }

        System.out.println(map.keySet().iterator().hasNext());
        System.out.println(map.keySet().iterator().next());

        while(keys.hasNext()){
            System.out.println(keys.next());
        }

        for(Object key: map.keySet()){
            System.out.println("key: " + key + " value: " + map.get(key));
        }


    }
}
