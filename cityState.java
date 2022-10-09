import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class cityState {
    static String firstTwo(String name){
        return name.substring(0, 2);
    }

    public static void main(String[] args) throws IOException {

        HashMap<String, String> cityState = new HashMap<>();

        int counter = 0;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++){
            StringTokenizer token = new StringTokenizer(bf.readLine());
            cityState.put(firstTwo(token.nextToken()), token.nextToken());
        }

        for(String city : cityState.keySet()){
           for(String city2 : cityState.keySet()){
               if(city.equals(cityState.get(city2)) && city2.equals(cityState.get(city))){
                   counter += 1;
               }
           }
        }

        for(String city : cityState.keySet()){
            System.out.println(city + "/" + cityState.get(city));
        }

        System.out.println(counter/2);
        bf.close();
        pw.close();
    }
}
