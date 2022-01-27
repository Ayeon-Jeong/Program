package HashMap;

import java.util.*;
import java.util.stream.Collectors;

// 프로그래머스: 베스트앨범
public class Solution4 {


    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop", "oldpop"};
        int[] plays = {500, 600, 150, 800, 2500, 1000};

        Map<String, Integer> map = new HashMap();
        Map gen = new HashMap();
        Map<String, Map> play = new HashMap();

        for(int i = 0; i < genres.length; i++){
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }

        List<Map.Entry<String, Integer>> entries = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toList());

//        for(Map.Entry<String, Integer> entry: entries){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

        Map<Integer, Integer> song = new HashMap<>();
        for(int i = 0; i < genres.length; i++){
            song.put(i, plays[i]);
        }







        System.out.println(entries);


    }

}
