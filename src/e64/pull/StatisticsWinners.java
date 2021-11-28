package e64.pull;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

public class StatisticsWinners implements Observer {
    private Map<Runner, Integer> competitionsWon = new HashMap<>();

    @Override
    public void update(Subject s) {
        SortedMap<Double, Runner> results = ((Competition) s).getResults();       
        Runner winner = results.get(results.firstKey());

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
