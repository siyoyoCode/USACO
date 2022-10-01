import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class angryCows {

    static int[] hayLocations = new int[100];
    static ArrayList<Integer> workingHays = new ArrayList<>();

    static int[] maxLocCount = {0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("angry.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("angry.out")));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++){
            StringTokenizer token = new StringTokenizer(bf.readLine());
            int hayBale = Integer.parseInt(token.nextToken());
            hayLocations[hayBale] = hayBale;
        }

//        for(int i = 0; i<hayLocations.length; i++){
//            System.out.println(hayLocations[i]);
//        }

        for(int i = 1; i < n+1; i++){
//            System.out.println(hayLocations[i-1] + "dsdfsf");
//            System.out.println(hayLocations[i+1] + "two");

            if((hayLocations[i-1] != 0) && (hayLocations[i+1] != 0) ){
                workingHays.add(hayLocations[i]);
            }
        }


        for(int i = 0; i<workingHays.size(); i++){
            System.out.println(workingHays.get(i));
        }

        for(int hay : workingHays){ //hay is hay locations that work
            int counter = 0;
            int explosionPositive = 1;
            int explosionNegative = 1;
            int newHays = hay;
            int newHays1 = hay;

            while(newHays + explosionPositive < 101 && hayLocations[newHays + explosionPositive] != 0){
                newHays = newHays + explosionPositive;
                explosionPositive += 1;
            }

            for(int j = hay; j < newHays + 1 ; j++){
                if(hayLocations[j] != 0){
                    counter += 1;
                }
            }

            while((newHays1 - explosionNegative > 0) && (hayLocations[newHays1 - explosionNegative] != 0)){
                newHays1 = newHays1 - explosionNegative;
                explosionNegative += 1;
            }

            for(int j = hay; j > newHays1 - 1; j--){
                if(hayLocations[j] != 0){
                    counter += 1;
                }
            }

            if(maxLocCount[1] < counter){
                maxLocCount[0] = hay;
                maxLocCount[1] = counter;
            }

        }

        pw.println(maxLocCount[0]);
        pw.close();
        bf.close();
    }
}
