package nl.han.observer;

import java.util.Observable;

public class Viewer implements IViewer {

    public void update(Observable o, Object arg) {
        System.out.println("Help help");
    }
}
