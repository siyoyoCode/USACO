import java.io.*;
import java.util.*;

public class notLast {
    static HashMap<String, Integer> cowLog = new HashMap<>();

    static ArrayList countofGallons = new ArrayList<>();
    static Set<Integer> gallonCount = new HashSet<>();
    static String name = "";

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++){
            StringTokenizer token = new StringTokenizer(bf.readLine());
            String cowName = token.nextToken();
            int gallon = Integer.parseInt(token.nextToken());
            if(cowLog.get(cowName) == null){
                cowLog.put(cowName, gallon);
            } else {
                cowLog.put(cowName, cowLog.get(cowName) + gallon);
            }
        }

        gallonCount.addAll(cowLog.values());

        if(cowLog.size() < 7){
            gallonCount.add(0);
        }

        countofGallons.addAll(gallonCount);
        Collections.sort(countofGallons);

        int gallon;
        if(countofGallons.contains(0)){
            gallon = (int)(countofGallons.get(0));
        } else {
            gallon = (int)(countofGallons.get(1));
        }

        int counter = 0;
        for(String key : cowLog.keySet()){
            if(cowLog.get(key) == gallon){
                counter += 1;
                name = key;
            }
        }

        if(counter != 1){
            System.out.println("Tie");
        } else {
            System.out.println(name);
        }

        bf.close();
        pw.close();
    }
}
