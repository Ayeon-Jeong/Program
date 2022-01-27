package HashMap;

import java.util.*;

public class Solution {
    public int index;
    public int play;

    public Solution(int index, int play) {
        this.index = index;
        this.play = play;
    }

    public Solution() {
    }

    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop", "oldpop"};
        int[] plays = {500, 600, 150, 800, 2500, 1000};

        Map<String, Integer> map = new HashMap<>();
        List<Integer> tmp = new ArrayList<>();

        for(int i = 0;  i < genres.length; i++){
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }

        List<String> list = new ArrayList<>(map.keySet());
        list.sort((v1, v2) -> map.get(v2).compareTo(map.get(v1)));

        System.out.println(list);

        Map<String, List<Solution>> song = new HashMap<>();
        for(String s: list){
            List<Solution> albums = new ArrayList<>();
            for(int i = 0; i < genres.length; i++){
                if(genres[i].equals(s)){
                    albums.add(new Solution(i, plays[i]));
                }
            }
            song.put(s, albums);
        }
        for(String s: list){
            song.get(s).sort((v1, v2) -> v2.play - v1.play);
            System.out.println(s);
            for(Solution a: song.get(s)){
                System.out.println(a.index);
                System.out.println(a.play);
            }
        }

        List<Integer> answer = new ArrayList<>();

        for(String s: list){
//            System.out.println(s + " " + song.get(s));
            int cnt = 0;
            for(int i = 0; i < song.get(s).size(); i++){
                answer.add(song.get(s).get(cnt).index);

                if(++cnt == 2)
                    break;
            }
        }

        System.out.println(answer);
    }

}
