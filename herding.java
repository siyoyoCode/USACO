/*
ID: siyonaona
LANG: JAVA
TASK: herding
*/


import java.io.*;
import java.util.StringTokenizer;

public class herding {

    static int[] cowLoc = new int[3];

    static int minimumMoves (int arr[]) {
        if(arr[1] - arr[0] == 2 || arr[2] - arr[1] == 2){
            return 1;
        } else if(arr[2] - arr[0] == 2) {
            return 0;
        } else {
            return 2;
        }
    }

    static int maxMoves (int[] arr) {
        int d1 = arr[1] - arr[0];
        int d2 = arr[2] - arr[1];
        return Math.max(d1, d2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("herding.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("herding.out"));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        for(int i = 0; i <3; i++){
            cowLoc[i] = Integer.parseInt(st.nextToken()); //all locations of cows are set
        }
        if(minimumMoves(cowLoc) == 0){
            pw.println(0);
            pw.println(0);
        } else {
            pw.println(minimumMoves(cowLoc)); //min
            pw.println(maxMoves(cowLoc) - 1); //max
        }
        pw.close();
    }
}