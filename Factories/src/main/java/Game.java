import model.Foe;
import model.FoeFactory;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private static final String MINION = "minion";
    private static final String END_BOSS = "EndBoss";

    private static final int WAIT_TIME_OF_THREAD = 2000;

    List<Foe> foes = new ArrayList<Foe>();

    public void init() {
        System.out.println("Initializing Game...");


        try {
            Thread.sleep(WAIT_TIME_OF_THREAD);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void attack() {
        for (Foe foe : foes) {
            foe.attack();
        }
    }

    private void createFoes() {
        foes.add(FoeFactory.getFoeFactory().createFoe(MINION));
        foes.add(FoeFactory.getFoeFactory().createFoe(MINION));
        foes.add(FoeFactory.getFoeFactory().createFoe(MINION));
        foes.add(FoeFactory.getFoeFactory().createFoe(END_BOSS));
        foes.add(FoeFactory.getFoeFactory().createFoe(END_BOSS));
    }

    public void loadLevelOne() {

        System.out.println("Loading Level 1...");

        createFoes();

        try {
            Thread.sleep(WAIT_TIME_OF_THREAD);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Level 1 loaded");

        attack();
    }
}
