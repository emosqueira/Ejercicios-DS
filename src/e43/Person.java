package e43;

import java.util.Random;

public class Person {

    private AccessControl panel;
    private Random r = new Random();

    public void setPanel(AccessControl panel) {
        this.panel = panel;
    }

    public void givePin() {
        for (int i = 0; i < 4; i++) {
            panel.digit(r.nextInt(9));
        }
    }

    public void wrongPinTryAgain(int remainingAttempts) {
        System.out.println("Remaining attemps: " + remainingAttempts);
        for (int i = 0; i < 4; i++) {
            panel.digit(r.nextInt(9));
        }
        // could be a call to givePin()
    }
    
    public void identification() {  // sequence beginning 
        panel.insertCard();   
    }

    public static void main(String[] args) {
        Person person = new Person();
        AccessControl panel = new AccessControl();
        person.setPanel(panel);
        panel.setPerson(person);
        person.identification();
    }
}
