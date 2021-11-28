package e64.push;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Runner c1 = new Runner("Runner 1");
        Runner c2 = new Runner("Runner 2");
        Runner c3 = new Runner("Runner 3");

        List<Runner> listOfRunners = new ArrayList<>();
        listOfRunners.add(c1);
        listOfRunners.add(c2);
        listOfRunners.add(c3);
        Competition race = new Competition(listOfRunners);

        Observer statisticsWinners = new StatisticsWinners();
        Observer statisticsBestTime = new StatisticsBestTime();
        race.attach(statisticsWinners);
        race.attach(statisticsBestTime);

        for (int i = 0; i < 4; i++) {
            System.out.println("\n NEW RACE!!");
            race.compete();
        }
    }
}
