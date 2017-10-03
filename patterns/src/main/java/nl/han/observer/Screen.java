package nl.han.observer;

import java.util.Observable;

public class Screen extends Observable{

    public void playScaryScene(){
        setChanged();
        notifyObservers();
    }
}
