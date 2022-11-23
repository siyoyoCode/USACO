/*
ID: siyonaona
LANG: JAVA
TASK: cowtip
*/

import java.io.*;
import java.util.StringTokenizer;

public class cowtip {

    static void flipper(char[][] arr1, int i, int j){
        if(arr1[i][j] == '1'){
            arr1[i][j] = '0';
        } else if(arr1[i][j] == '0'){
            arr1[i][j] = '1';
        }
    }

    static void flipCows(int row, int width, char[][] arr){
        for(int i = 0; i <= row; i++){
            for(int j = 0; j <= width; j++){
                flipper(arr, i, j);
            }
        }
    }

    static void putValtoArr(int row, int N, BufferedReader bf, char[][] arr) throws IOException {
        StringTokenizer st = new StringTokenizer(bf.readLine());
        String cowTip = st.nextToken();
        for(int k = 0; k < N; k++){
            arr[row][k] = cowTip.charAt(k);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("cowtip.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("cowtip.out"));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());

        char[][] cowArray = new char[N][N]; //2d arr of cow locs

        for(int i = 0; i<N; i++){
            putValtoArr(i, N, bf, cowArray);
        }

        int counter = 0;
        for(int i = N-1; i >= 0; i--){
            for(int j = N-1; j >= 0; j--){
                if(cowArray[i][j] == '1'){
                    flipCows(i, j, cowArray);
                    counter += 1;
                }
            }
        }

        pw.println(counter);
        pw.close();
        bf.close();
    }
}
