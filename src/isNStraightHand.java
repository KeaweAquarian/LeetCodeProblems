import java.util.TreeMap;

public class isNStraightHand {
    public static void main(String[] args) {
        int [] hand = {1, 4, 2, 3, 3,5,6,7, 9};

        System.out.println(isnStraightHand(hand, 3));
    }

    private static boolean isnStraightHand(int[] hand, int i) {
        if (hand.length %i != 0) return false;
        TreeMap<Integer, Integer> card_Count = new TreeMap<>();
        for (Integer card:hand
             ) {
            if (!card_Count.containsKey(card))card_Count.put(card, 1);
            else card_Count.replace(card, card_Count.get(card) +1);
        }
        while (card_Count.size() > 0){
            int startingCard = card_Count.firstKey();
            for (int j = startingCard; j < startingCard + i ; j++) {
                if (!card_Count.containsKey(j))return false;
                if (card_Count.get(j) == 1){
                    card_Count.remove(j);
                }
                else card_Count.replace(j, card_Count.get(j) -1);
            }
        }


        return true;
    }
}
