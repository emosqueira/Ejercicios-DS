package e64.push;

import java.util.HashMap;
import java.util.Map;

public class StatisticsWinners implements Observer {
    private Map<Runner, Integer> competitionsWon = new HashMap<>();

    @Override
    public void update(Subject s, Runner winner, double winnerTime) {

        if (!competitionsWon.containsKey(winner)) {
            competitionsWon.put(winner, 1);
        } else {
            competitionsWon.replace(winner, competitionsWon.get(winner) + 1);
        }
        
        for (Runner n : competitionsWon.keySet()) {
            System.out.println(n.getName() + " has won " + competitionsWon.get(n) + " competitions so far.");
        }
    }
}
