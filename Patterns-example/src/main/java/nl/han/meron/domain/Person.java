package nl.han.meron.domain;

import nl.han.meron.domain.crowdbehaviour.AgressionLevel;

public class Person {

    private AgressionLevel agressionLevel;

    public Person(AgressionLevel agressionLevel) {
        this.agressionLevel = agressionLevel;
    }
}
