package e64.pull;

import java.util.SortedMap;

public class StatisticsBestTime implements Observer {

    private double record = Double.MAX_VALUE;

    @Override
    public void update(Subject s) {
        
        SortedMap<Double, Runner> results = ((Competition) s).getResults();
        Double lastBestTime = results.firstKey();
        if (lastBestTime < record) {
            record = lastBestTime;
            System.out.println("New record: " + record);
        }
    }
}
