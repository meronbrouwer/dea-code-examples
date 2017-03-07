package nl.han.meron;

import nl.han.meron.domain.AgressionLevel;
import nl.han.meron.domain.Crowd;
import nl.han.meron.domain.Person;
import nl.han.meron.domain.Speaker;

import java.util.ArrayList;

public class Demonstration {

    private Crowd crowd;
    private Speaker speaker;

    public Demonstration() {
        int sizeOfCrowd = 0;
        ArrayList<Person> persons = new ArrayList<Person>();

        while (sizeOfCrowd < 100) {
            persons.add(new Person(AgressionLevel.Low));
            sizeOfCrowd++;
        }

        speaker = new Speaker(AgressionLevel.Low);

        crowd = new Crowd(persons);
    }


    public void demonstrate() {
        speaker.speech();
    }
}
