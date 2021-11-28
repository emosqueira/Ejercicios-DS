package e64.pull;

import java.util.Collections;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class Competition extends Subject {

    private List<Runner> listOfRunners;
    private SortedMap<Double, Runner> results;

    public Competition(List<Runner> listOfRunners) {
        this.listOfRunners = listOfRunners;
    }

    public void compete() {
        double t;
        results = new TreeMap<>();
        System.out.println("----------------");
        for (Runner r : listOfRunners) {
        
            t = r.run();
            System.out.println(r.getName() + "'s time: " + t);
            results.put(t, r);
        }
        System.out.println("----------------");
        notifyObservers();
    }

    public List<Runner> getListOfRunners() {
        return Collections.unmodifiableList(listOfRunners);
    }

    public SortedMap<Double, Runner> getResults() {
        return Collections.unmodifiableSortedMap(results);
    }    
}
