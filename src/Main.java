import java.util.List;

/**
 * Main class
 */
public class Main {

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> monsters = List.of(10, 20, 30, 40, 25, 15, 35);
        int np = 50;
        int potion = 1;

        int lastDefeated = Solution.lastDefeatedMonster(monsters, np, potion);
        System.out.println("Last defeated monster: " + lastDefeated);
    }
}