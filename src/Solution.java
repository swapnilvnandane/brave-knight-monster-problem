import java.util.List;

/**
 * Solution class
 */
public class Solution {

    /**
     * Method to find last defeated monster
     *
     * @param monsters
     * @param k
     * @param potion
     *
     * @return {@link Integer}
     */
    public static int lastDefeatedMonster(List<Integer> monsters, int k, int potion) {
        if(monsters.isEmpty()) {
            return -1;
        }

        int counter = 0;

        for(int i = 1; i < monsters.size(); i++) {
            if(monsters.get(i) < monsters.get(i-1)) {
                counter = i;
            } else {
               int damage = monsters.get(i) - monsters.get(i-1);

               if(damage <= k) {
                   k -= damage;
                   counter = i;
               } else if (potion > 0) {
                   potion--;
                   counter = i;
               } else {
                   break;
               }
            }
        }
        return counter;
    }
}
