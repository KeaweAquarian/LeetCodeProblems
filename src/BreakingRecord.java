import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakingRecord {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(10, 12, 15, 12, 10, 15, 10));



        System.out.println(returnHighLow(arr));



    }

    private static List<Integer> returnHighLow(List<Integer> arr) {
        List<Integer> results = new ArrayList<>();
        int high = arr.get(0);
        int low = arr.get(0);
        int countHigh = 0;
        int countLow = 0;

        for(Integer score:arr){
            if(score > high){
                countHigh++;
                high = score;
            }
            if(score < low){
                countLow++;
                low = score;
            }
        }
//        results.add(countHigh);
//        results.add(countLow);

        results.add(arr.stream().min((a, b)->a-b).get());
        return results;

    }

}
