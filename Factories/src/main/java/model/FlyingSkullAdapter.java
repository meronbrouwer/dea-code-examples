package model;

import externalmodel.FlyingSkull;

public class FlyingSkullAdapter implements Foe {

    private final FlyingSkull skull;

    public FlyingSkullAdapter(){
        skull = new FlyingSkull();
    }

    public void attack() {
        skull.breathFire();
    }
}
