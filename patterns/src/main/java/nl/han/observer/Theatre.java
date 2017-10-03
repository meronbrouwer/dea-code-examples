package nl.han.observer;

import java.util.ArrayList;
import java.util.List;

public class Theatre {

    private Screen screen;
    private List<IViewer> viewers = new ArrayList<IViewer>();

    public void beginMovie() {
        screen = new Screen();

        viewers.add(new Viewer());
        viewers.add(new Viewer());
        viewers.add(new Viewer());
        viewers.add(new Viewer());
        viewers.add(new Viewer());


        for (IViewer viewer : viewers) {
            screen.addObserver(viewer);
        }

        screen.addObserver(new BoredViewer());


    }

}
