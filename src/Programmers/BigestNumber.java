package Programmers;
import java.util.*;



public class BigestNumber {

    public String dddd(String s){
        while(s.length() > 1){
            if(s.charAt(0) == '0'){
                s = s.substring(1);
            }
            else{
                return s;
            }
            System.out.println(s);
        }
        return s;
    }

    public String solution(int[] numbers) {
        String answer = "";
        ArrayList<Integer> list= new ArrayList<>();
        for(int i = 0; i < numbers.length; i++){
            list.add(numbers[i]);
        }
        list.sort((a, b) -> Integer.parseInt(b.toString() + a.toString()) - Integer.parseInt(a.toString() + b.toString()));

        System.out.println(list);

        for(Integer i: list){
            answer += Integer.toString(i);
        }

        answer = dddd(answer);
        return answer;
    }

    public static void main(String[] args) {

        int[] numbers = {70, 0, 0, 0};
        String answer = new BigestNumber().solution(numbers);
        System.out.println(answer);
    }
}
