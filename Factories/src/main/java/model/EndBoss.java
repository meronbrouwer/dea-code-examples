package model;

public class EndBoss implements Foe, Damage {

    public static final int FULL_DAMAGE = 2021;

    public void attack() {
        System.out.println("ROAAARRRRR, Endboss is attacking.");
    }

    public void doDamage(){

        applyDamage(FULL_DAMAGE);

    }

    private void applyDamage(int i) {
    }
}
