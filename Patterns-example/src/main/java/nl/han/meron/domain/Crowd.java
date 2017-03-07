package nl.han.meron.domain;

import nl.han.meron.domain.crowdbehaviour.AgressionLevel;

import java.util.ArrayList;

public class Crowd {

    private ArrayList<Person> persons = new ArrayList<Person>();
    private AgressionLevel agressionLevel;
    private boolean crowdIsGoingWild = false;

    public Crowd(ArrayList<Person> persons) {
        this.persons = persons;
        this.agressionLevel = AgressionLevel.Low;
    }

    private void incrementAgressionLevel() {
        if (this.agressionLevel.equals(AgressionLevel.Low)) {
            this.agressionLevel = AgressionLevel.Medium;
        } else if (this.agressionLevel.equals(AgressionLevel.Medium)) {
            this.agressionLevel = AgressionLevel.High;
        } else {
            System.out.print("DESTROOOOOOOOOOYYYYYYYY");
            crowdIsGoingWild = true;
        }
    }

    public boolean isCrowdIsGoingWild(){
        return crowdIsGoingWild;
    }

}
