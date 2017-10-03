package nl.han.patterns;

public class PrimeTesterFactory {

    private static PrimeTesterFactory factory;

    private PrimeTesterFactory() {
    }

    public static PrimeTesterFactory getInstance() {
        if (factory == null){
            factory = new PrimeTesterFactory();
        }

        return factory;
    }

    public PrimeTester createPrimeTester(PrimeTesterType type) {
        switch (type) {
            case SIMPLE:
                return new SimplePrimeTester();
            case ULTRA:
                return new PrimeTesterApacheMathSjizzleAdapter();
            default:
                return new HardPrimeTester();
        }

    }
}
