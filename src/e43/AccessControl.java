package e43;

import java.util.ArrayList;
import java.util.List;

public class AccessControl {

    private Person person;
    List<Integer> pin = new ArrayList<>();

    public void setPerson(Person person) {
        this.person = person;
    }

    public void insertCard() {
        person.givePin();

        int i = 0;

        while (wrongPin() && i < 2) {
            System.out.println("Sorry, wrong PIN: " + pin.toString() + ". Try Again.");
            pin.clear();
            person.wrongPinTryAgain(2 - i);
            i++;
        }
        
        if (i == 2)
            System.out.println("Access denied");
        else
            System.out.println("Access allowed");
    }

    public void digit(int i) {
        System.out.println("Digit: " + i);
        pin.add(i);
    }

    private boolean wrongPin() { // Database access simulation
        return (Math.random() < 0.5);
    }
}