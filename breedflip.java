/*
ID: siyonaona
LANG: JAVA
TASK: breedflip
*/

import java.io.*;
import java.util.StringTokenizer;

public class breedflip {

    static void sameLetterRemove(char[] arr1, char[] arr2){ //replaces all same letters with 0
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] == arr2[i]){
                arr2[i] = ' ';
            }
        }
    }

    static int checkNull(char[] arr){
        int counter = 0;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] != ' ' && arr[i+1] == ' '){
                counter += 1;
            }
        }
        return counter;
    }

    static public void main(String[] args) throws IOException {
        BufferedReader bf  = new BufferedReader(new FileReader("breedflip.in"));  //new FileReader("breedflip.in")
        PrintWriter pw = new PrintWriter("breedflip.out");

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());

        char[] stringA = new char[N];
        char[] stringB = new char[N];

        StringTokenizer str = new StringTokenizer(bf.readLine()); //string A
        String token1 = str.nextToken();
        for(int j = 0; j < N; j++){
            stringA[j] = token1.charAt(j);
        }

        StringTokenizer token = new StringTokenizer(bf.readLine());
        String token2 = token.nextToken();
        for(int j = 0; j < N; j++){
            stringB[j] = token2.charAt(j);
        }

        sameLetterRemove(stringA, stringB);

        if(stringB[N-1] != ' '){
            pw.println(checkNull(stringB) + 1);
        } else {
            pw.println(checkNull(stringB));
        }

        pw.close();
        bf.close();
    }
}
