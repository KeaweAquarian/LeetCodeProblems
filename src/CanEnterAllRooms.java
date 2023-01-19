import java.util.HashMap;
import java.util.Map;

public class CanEnterAllRooms {
    public static void main(String[] args) {
        int[][] arr = {{1}, {2}, {3}, {}};
        System.out.println(canEnterAllRoomes(arr));



}
    private static boolean canEnterAllRoomes(int[][] arr) {

        Map<Integer, Boolean> map = new HashMap<>();
        map.put(0,false);

        while (map.containsValue(false)){
            for (Map.Entry<Integer,Boolean> entry : map.entrySet()) {
                for (int i = 0; i < arr[entry.getKey()].length ; i++) {
                    if (!map.containsKey(arr[entry.getKey()][i]))
                        map.put(arr[entry.getKey()][i], false);
                }


                map.replace(entry.getKey(), true);
            }
        }
        return (map.size() == arr.length);
    }

}
