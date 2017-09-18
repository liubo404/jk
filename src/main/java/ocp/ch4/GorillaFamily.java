package ocp.ch4;

/**
 * User: liubo
 * Datetime: 2017/9/1815:32
 */
interface Gorilla {
    String move();
}

public class GorillaFamily {
    String walk = "walk";

    void everyonePlay(boolean baby) {
        String approach = "amble";

        play(() -> walk);
        play(() -> baby ? "hitch a ride" : "run");
        play(() -> approach);

    }

    void play(Gorilla g) {
        System.out.println(g.move());
    }

    public static void main(String[] args) {
        GorillaFamily gf = new GorillaFamily();
        gf.everyonePlay(true);
    }
}
