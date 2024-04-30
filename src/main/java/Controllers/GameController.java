package Controllers;
import harshit.Game;
import harshit.GameState;
import harshit.Player;

import java.lang.management.ManagementFactory;
import java.util.*;

public class GameController {
    public Game startGame(int dimension, List<Player> players) {
        // TODO

        // Validate whether 2 players have the symbols.
        // If they have the same symbol, throw some code exception
        return new Game(dimension, players);
    }

    public void makeMove(Game game) {
        return;
    }

    public GameState checkState(Game game) {
        return game.getGameState();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void printBoard(Game game) {
        game.printBoard();
    }

}
