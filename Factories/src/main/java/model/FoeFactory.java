package model;

import externalmodel.FlyingSkull;

public class FoeFactory {

    private static FoeFactory foeFactory;

    private void FoeFactory() {

    }

    public static FoeFactory getFoeFactory() {
        if (foeFactory == null) {
            foeFactory = new FoeFactory();
        }

        return foeFactory;
    }


    public Foe createFoe(String type) {

        if ("minion".equals(type.toLowerCase())) {
            return new Mininion();
        } else if ("endboss".equals(type.toLowerCase())) {
            return new EndBoss();
        } else if ("flyingskull".equals(type.toLowerCase())){
            return new FlyingSkullAdapter();
        } else {
            return null;
        }
    }
}
