package HashMap;

import java.util.*;

//
public class Sol {

    public String src;
    public String dst;

    public Sol(String src, String dst) {
        this.src = src;
        this.dst = dst;
    }

    public Sol() {
    }

    public String solution(String[] participant, String[] completion){
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();
        for(String player : participant){
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        for(String player : completion){
            map.put(player, map.get(player) - 1);
        }

        return answer;


    }



    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        System.out.println(new Sol().solution(participant, completion));

//        System.out.println("Hello");
    }
}
