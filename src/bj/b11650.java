package bj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b11650 {

    int x, y;


    public b11650(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N; N = in.nextInt();
        List<b11650> list = new ArrayList<>();
        while(N-- > 0){
            int x, y;
            x = in.nextInt(); y = in.nextInt();
            list.add(new b11650(x, y));
        }

        list.sort((v1, v2) -> {
            if (v1.x == v2.x) {
                return v1.y - v2.y;
            }
            else
                return v1.x - v2.x;
        });

        for(b11650 i: list){
            System.out.println(i.x + " " + i.y);
        }
    }
}


