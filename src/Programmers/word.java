package Programmers;
import java.util.*;

public class word {
    public boolean cmp(String s1, String s2){
        int cnt = 0;
//        System.out.println("s1: " + s1+ " s2: " + s2);
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                cnt++;
//                System.out.println(cnt);
            }
        }
        if(cnt == 1)
            return true;

        return false;
    }
    static boolean[] visit = new boolean[51];
    static int min = 9999;
    public int dfs(String s, int cnt, String[] words, String target, int index, boolean[] visit) {
        visit[index] = true;
        if(s == target)
            return cnt;

        System.out.println("s: " + s + " cnt: " + cnt + " index: " + index);
        for(int i = 0; i < words.length; i++){
            if(!visit[i] && cmp(s, words[i])){
//                visit[index] = true;
                dfs(words[i], cnt+1, words, target, i, visit);
            }
        }

        return cnt;
    }

    public int solution(String begin, String target, String[] words) {
        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        System.out.println(new word().dfs(begin, 0, words, target, 0, new boolean[51]));
    }
}
