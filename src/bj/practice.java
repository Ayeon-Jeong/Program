package bj;
import java.util.*;

class node11 {
    String a;
    String b;
    public node11(String a, String b){
        this.a = a;
        this.b = b;
    }

//    @Override
//    public int compareTo(node11 o){
//        return this.a.toUpperCase().compareTo(o.a.toUpperCase());
//    }
}


public class practice {

    public static void main(String[] args) {

        ArrayList<node11> node = new ArrayList<>();

        node.add(new node11("abc", "DEF"));
        node.add(new node11("bcd", "fdd"));
        node.add(new node11("DFE", "FFF"));

        node.sort((node11 o1, node11 o2) -> {return o1.a.toUpperCase().compareTo(o2.a.toUpperCase());} );

        for(node11 i: node){
            System.out.println(i.a);
        }

        String[] strArray = { "a", "p", "p", "l", "e" };

        HashMap<String , Integer> map = new HashMap<String , Integer>();

        map.put("신논현", 1);
        map.put("강남", 2);
        map.put("혜화", 3);
        map.put("안양", 4);
        map.put("수원", 5);

        Set set = map.entrySet();
//        for(int i = 0; i < set.size(); i++){
//            System.out.println(set);
//        }

        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String, Integer> entry = iter.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
//        System.out.println(set.iterator().hasNext());
    }
}
