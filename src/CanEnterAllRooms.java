import java.util.*;

public class CanEnterAllRooms {
    public static void main(String[] args) {
        int[][] arr = {{1}, {2}, {3}, {}};
        System.out.println(canEnterAllRoomes(arr));
        List<List<Integer>> rooms = List.of(List.of(1), List.of(2), List.of(3), List.of());
        System.out.println(canEnterAllRoomes2(rooms));


}

    private static boolean canEnterAllRoomes2(List<List<Integer>> rooms) {
        boolean[] seen = new boolean[rooms.size()];
        seen[0]=true;

        Stack<Integer> keys = new Stack<>();
        keys.add(0);
        while (!keys.isEmpty()){
            int current = keys.pop();

            for (int newKey:rooms.get(current)){
                if (!seen[newKey]){
                    seen[newKey] = true;
                    keys.add(newKey);
                }
            }
        }
        for (boolean visited:seen){
            if (!visited)return false;
        }
        return true;
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
