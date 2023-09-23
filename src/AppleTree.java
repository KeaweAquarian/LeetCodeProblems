import java.util.List;
import java.util.Vector;

public class AppleTree {

    public static void main(String[] args) {

    }

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int countApples = 0;
        int countOranges = 0;
        for (Integer apple: apples
             ) {
            if((a + apple) >= s && (a + apple) <= t)countApples++;
        }

        for (Integer orange: oranges
        ) {
            if((a + orange) > s && (a + orange) <= t)countOranges++;
        }

        System.out.println(countApples);
        System.out.println(countOranges);



    }


}
