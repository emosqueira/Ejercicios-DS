package e64.pull;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;

class MedalData {

    public int gold;
    public int silver;
    public int bronze;
}

public class StatisticsMedals implements Observer {

    private Map<Runner, MedalData> medals = new HashMap<>();

    @Override
    public void update(Subject s) {
        SortedMap<Double, Runner> results = ((Competition) s).getResults();
        Iterator<Entry<Double, Runner>> iterator = results.entrySet().iterator();

        // Gold medal
        Entry<Double, Runner> entry = iterator.next();
        Runner runner = entry.getValue();
        MedalData runnerMedals = medals.get(runner);
        if (runnerMedals == null) {
            runnerMedals = new MedalData();
        }
        runnerMedals.gold++;
        medals.put(runner, runnerMedals);

        // Silver medal
        entry = iterator.next();
        runner = entry.getValue();
        runnerMedals = medals.get(runner);
        if (runnerMedals == null) {
            runnerMedals = new MedalData();
        }
        runnerMedals.silver++;
        medals.put(runner, runnerMedals);

        // Bronze medal
        entry = iterator.next();
        runner = entry.getValue();
        runnerMedals = medals.get(runner);
        if (runnerMedals == null) {
            runnerMedals = new MedalData();
        }
        runnerMedals.bronze++;
        medals.put(runner, runnerMedals);

        // Print statistics
        for (Runner n : medals.keySet()) {
            System.out.println(n.getName() + " has won "
                    + medals.get(n).gold + " gold medals, "
                    + medals.get(n).silver + " silver medals and "
                    + medals.get(n).bronze + " bronze medals");

        }
    }
}
