package nl.han.meron.domain;

public class Speaker {

    private Crowd crowd;

    public Speaker(Crowd crowd) {
        this.crowd = crowd;
    }

    public void speech() {
        saySomethingThatWorkesTheCrowd();
    }

    private void saySomethingThatWorkesTheCrowd() {
        while (!crowd.isCrowdIsGoingWild()) {
            System.out.println("Speaker is saying something");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
