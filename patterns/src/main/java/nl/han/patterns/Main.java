package nl.han.patterns;

public class Main {

    public void doTesting(){
        PrimeTesterFactory factory = PrimeTesterFactory.getInstance();
        PrimeTester primeTester = factory.createPrimeTester(PrimeTesterType.ULTRA);
    }
}
