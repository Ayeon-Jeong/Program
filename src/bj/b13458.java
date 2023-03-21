package bj;
import java.util.*;

public class b13458 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N; N = in.nextInt();
        ArrayList<Integer> arr = new ArrayList();
        for(int i = 0; i < N; i++){
            Integer tmp;
            tmp = in.nextInt();
            arr.add(tmp);
        }
        int B; B = in.nextInt();
        int C; C = in.nextInt();

        long answer = 0;
        for(Integer i : arr){
            int tmp = i - B;
            if(tmp > 0){
                if(tmp % C == 0){
                    answer += 1 + (tmp / C);
                }
                else{
                    answer += 2 + (tmp / C);
                }
            }

        }

        System.out.print(answer);
    }
}
