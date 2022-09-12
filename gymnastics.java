/*
ID: siyona11
LANG: JAVA
TASK: gymnastics
*/

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class gymnastics {
    static HashMap<Integer, ArrayList<Integer>> allRanks = new HashMap<>();

    static int counter = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new FileReader("gymnastics.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("gymnastics.out")));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for(int i = 0; i < k; i++){
            StringTokenizer token = new StringTokenizer(bf.readLine()); //new st for each line
            ArrayList<Integer> cowRanks = new ArrayList<>(); //new array for each line
            for(int j = 0; j < n; j++){ //cycle through each cow in line
                cowRanks.add(Integer.parseInt(token.nextToken())); //add cow in order of rank
                allRanks.put(i, cowRanks); //hashmap stored
            }
        }

        int key = 0;
        for(int i = 0; i < allRanks.get(key).size()-1; i++){  //for each int in the arrayList of key
            int cow1 = allRanks.get(key).get(i);
            for(int j = i+1; j < allRanks.get(key).size(); j++){ //second cow to pick
                int cow2 = allRanks.get(key).get(j);
                int listCounter = 0;
                for(int key2 : allRanks.keySet()){
                    if(allRanks.get(key2).indexOf(cow1) < allRanks.get(key2).indexOf(cow2)) {
                        listCounter += 1;
                        if (listCounter == k) {
                            counter += 1;
                        }
                    } else if (allRanks.get(key2).indexOf(cow1) > allRanks.get(key2).indexOf(cow2)) {
                        break;
                    }
                }
            }
        }
        pw.println(counter);
        pw.close();
        bf.close();
    }
}
