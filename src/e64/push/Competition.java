package e64.push;

import java.util.List;

/**
 *
 * @author Eduardo Mosqueira Rey
 */
public class Competition extends Subject {

    private List<Runner> listOfRunners;

    public Competition(List<Runner> listOfRunners) {
        this.listOfRunners = listOfRunners;
    }

    public void compete() {
        Runner winner = null;
        double winnerTime = Double.MAX_VALUE;
        double t;
        System.out.println("----------------");
        for (Runner r : listOfRunners) {
            t = r.run();
            System.out.println(r.getName() + "'s time: " + t);
            if (t < winnerTime) {
                winnerTime = t;
                winner = r;
            }
        }
        System.out.println("----------------");
        notifyObservers(winner, winnerTime);
    }   
}
