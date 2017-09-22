public class GameFactory {

    private static GameFactory gameFactory;

    private void GameFactory() {

    }

    public static GameFactory getGameFactory() {
        if (gameFactory == null) {
            gameFactory = new GameFactory();
        }

        return gameFactory;
    }

    public Game createGame(){
        Game game = new Game();
        game.init();

        return game;
    }
}
