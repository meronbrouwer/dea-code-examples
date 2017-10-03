package nl.han.observer;

import java.util.Observable;

public class BoredViewer implements IViewer {
    public void update(Observable o, Object arg) {
        System.out.println("BOOOORING");
    }
}
