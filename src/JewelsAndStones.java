import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones {
    public static void main(String[] args) {

    }
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;

        for(int i = 0; i < jewels.length(); i++){
            map.put(jewels.charAt(i), 1);
        }

        for(int i = 0; i < stones.length(); i++){
            if (map.containsKey(stones.charAt(i))) result +=1;
        }

        return result;
    }
}
