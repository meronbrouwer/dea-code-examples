public class Main {

    public static void main(String[] args) {
        Game game = GameFactory.getGameFactory().createGame();

        game.loadLevelOne();
    }
}
