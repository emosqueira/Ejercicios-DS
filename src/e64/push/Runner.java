package e64.push;

public class Runner {

    private final String name;

    public Runner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double run() {
        return Math.random() * 120;
    }
}
