package e64.push;

public class StatisticsBestTime implements Observer {

    private double record = Double.MAX_VALUE;

    @Override
    public void update(Subject s, Runner winner, double winnerTime) {
        if (winnerTime < record) {
            record = winnerTime;                  
            System.out.println("New record: " + winner.getName() + " - " + winnerTime);
        }
    }
}
