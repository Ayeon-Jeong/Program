package bj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b7568 {

    int x, y;

    public b7568(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public b7568() {
    }

    public int F(List<b7568> list, b7568 me) {
        int rank = 0;

        for(b7568 i: list){
            if(i.x > me.x && i.y > me.y)
                rank++;
        }

        return rank + 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<b7568> list = new ArrayList<>();

        for(int i = 0; i < N; i++){
            int x = in.nextInt();
            int y = in.nextInt();

            b7568 b = new b7568(x, y);
            list.add(b);
        }

        for(b7568 i: list){
            System.out.print(new b7568().F(list, i));
            System.out.print(" ");
        }
    }
}
