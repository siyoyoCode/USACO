import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class cowCrossing {

    static ArrayList<Integer> time = new ArrayList<>();
    static HashMap<Integer, Integer> timeAndStay = new HashMap<>();

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new FileReader("cowqueue.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("cowqueue.out")));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++){
            StringTokenizer token = new StringTokenizer(bf.readLine());
            int timeArrived = Integer.parseInt(token.nextToken());
            int timeStayed2 = Integer.parseInt(token.nextToken());
            time.add(timeArrived);
            timeAndStay.put(timeArrived, timeStayed2);
        }

        Collections.sort(time);

        int totalTime = timeAndStay.get(time.get(0)) + time.get(0);
        for(int i = 1; i < n; i++){
            if(totalTime >= time.get(i)){
                totalTime = totalTime + timeAndStay.get(time.get(i));
            } else {
                totalTime = time.get(i) + timeAndStay.get(time.get(i));
            }
        }

        pw.println(totalTime);
        pw.close();
        bf.close();
    }
}
