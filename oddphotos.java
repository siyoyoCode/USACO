/*
ID: siyonaona
LANG: JAVA
TASK: input arrives from the terminal / stdin
*/

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class oddphotos { // ZERO IS EVEN 1 IS ODD

    static int groupCounter(int odd, int even){
        int diff = odd - even;
        int total = even + odd;

        if(diff == 0){
            return total;
        } else if (diff == 1) {
            return total - 2;
        } else if (diff == 2){
            return total - 1;
        } else if(even > odd){
            return (2 * odd) + 1;
        } else {
            return groupCounter(odd - 2, even + 1);
        }
    }

    static ArrayList<Integer> evenCows = new ArrayList<>();
    static ArrayList<Integer> oddCows = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            int cow = sc.nextInt();
            if(cow % 2 == 0){
                evenCows.add(cow);
            } else {
                oddCows.add(cow);
            }
        }

        int cowE = evenCows.size();
        int cowO = oddCows.size();

        System.out.println(groupCounter(cowO, cowE));

    }
}
