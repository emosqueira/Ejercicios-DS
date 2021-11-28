package e64.push;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo Mosqueira Rey
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();
    
    public void attach(Observer o) {
        observers.add(o);
    }
    
    public void detach(Observer o) {
        observers.remove(o);
    }
    
    public void notifyObservers(Runner winner, double winnerTime) {
        for (Observer o : observers) 
            o.update(this, winner, winnerTime);
    } 
}
