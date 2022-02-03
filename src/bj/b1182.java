package bj;
import java.lang.reflect.Array;
import java.util.*;

public class b1182 {

    static int answer;

    public void Solution(ArrayList<Integer> list, int target, int index, int sum){
        sum += list.get(index);

        if(sum == target)
            answer++;

        if(index+1 >= list.size())
            return;


        Solution(list, target, index + 1, sum);
        Solution(list, target, index + 1, sum - list.get(index));

        return;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList list = new ArrayList();

        int N, S; N = in.nextInt(); S = in.nextInt();
        for(int i = 0; i < N; i++){
            int a = in.nextInt();
            list.add(a);
        }

        answer = 0;

        new b1182().Solution(list, S, 0, 0);
        System.out.println(answer);
    }

}
