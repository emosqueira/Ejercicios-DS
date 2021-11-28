package e64.push;

/**
 *
 * @author Eduardo Mosqueira Rey
 */
public interface Observer {
    void update(Subject s, Runner winner, double winnerTime);
}
