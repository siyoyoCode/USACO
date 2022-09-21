import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.*;

public class Kayaking {
    static ArrayList<Integer> weightDifference1 = new ArrayList<>();
    static ArrayList<Integer> weightDifference2 = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        ArrayList<Integer> weight = new ArrayList<>();

        int n = sc.nextInt();

        for(int i = 0; i < 2 * n; i++){
            weight.add(sc.nextInt());
        }

        Collections.sort(weight);

        for(int i = 0; i < weight.size(); i++){
            if(i % 2 == 0 || i == 0){
                if(i == weight.size()-1){
                    weightDifference1.add(weight.get(i));
                } else {
                    weightDifference1.add(weight.get(i+1) - weight.get(i));
                }
            } else if(i % 2 == 1){
                if(i == weight.size()-1){
                    weightDifference2.add(weight.get(i) - weight.get(0));
                } else {
                    weightDifference2.add(weight.get(i+1) - weight.get(i));
                }
            }
        }

        //find max difference and remove
        weightDifference1.remove(weightDifference1.indexOf(Collections.max(weightDifference1)));
        weightDifference2.remove(weightDifference2.indexOf(Collections.max(weightDifference2)));

        int weight1Sum = 0;
        for (Integer difference : weightDifference1) {
            weight1Sum += difference;
        }

        int weight2Sum = 0;
        for (Integer integer : weightDifference2) {
            weight2Sum += integer;
        }

        if(weight1Sum > weight2Sum){
            pw.println(weight2Sum);
            System.out.println(weight2Sum);
        } else {
            pw.println(weight1Sum);
            System.out.println((weight1Sum));
        }

    }
}
