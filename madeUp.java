import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class madeUp {

    static int[] putValToArr(int n, BufferedReader bf) throws IOException {
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        int counter = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[] aList = putValToArr(n, bf);
        int[] bList = putValToArr(n, bf);
        int[] cList = putValToArr(n, bf);

        for(int a : aList){
            for(int i = 0; i < n; i++){
                if(bList[i] == a){
                    for(int c : cList)
                        if(c == i+1){
                        counter += 1;
                    }
                }
            }
        }

        System.out.println(counter);

    }
}
