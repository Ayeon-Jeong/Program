package Programmers;
import java.util.*;


public class KthNumber {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < commands.length; i++){
            int[] newArray = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(newArray);
            answer[i] = newArray[commands[i][2] - 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] answer = new KthNumber().solution(array, commands);
        for(int i : answer){
            System.out.println(i);
        }
    }
}
