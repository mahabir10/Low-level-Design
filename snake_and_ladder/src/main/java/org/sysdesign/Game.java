package org.sysdesign;

import org.sysdesign.board.Board;

import java.util.LinkedList;
import java.util.List;

public class Game {

    /*
    This class will be responsible for managing the game
    It will have the following responsibilities:
    1. Initialize the game with players, board, dice etc.
    2. Manage the turns of the players - through a circular list of queue or any other data structure
    3. Check for win condition after every turn, if it wins then put the player out of the circular list or queue and put it in the queue or list of winners
    4. The game will continue until there is only one player left in the circular list or queue
    5. Announce the winners at the end of the game
    6. It will expose a method to get the current state of the players.
    7. There should be a method to make a move for the current player. This method will be called by the main method or the controller class.
    8. It should have a state - IN_PROGRESS, COMPLETED
    9. If it is COMPLETED, it should not allow any more moves. It will throw an exception and will say the winner is ...

    This class should be thread safe. Because it is keeping the state of the game. If multiple threads are trying to make a move at the same time, it can lead to inconsistent state of the game.
     */

    public enum GameState {
        IN_PROGRESS,
        COMPLETED
    }



    private GameState state;
    private final Board board;
    private final Dice dice;
    // List containing the winners in order
    private final List<Player> winners;

    // There should be a way to manage the turns of the players
    // We can use an index to keep track of the current player
    private final CircularList<Player> turnManager;

    public Game(Board board, int noOfPlayers, Dice dice) {
        this.board = board;
        this.dice = dice;
        this.state = GameState.IN_PROGRESS;
        this.winners = new LinkedList<>();

        List<Player> players = new LinkedList<>();
        for (int i = 1; i <= noOfPlayers; i++) {
            players.add(new Player("Player-" + i));
        }

        this.turnManager = new CircularList<>(players);
    }

    // Other methods to manage the game will go here

    // Getters and setters

    public synchronized GameState getState() {
        return state;
    }


    public synchronized List<Player> getWinners() {
        return winners;
    }

    // Method to make a move for the current player
    public synchronized void makeMove() {
        if (state == GameState.COMPLETED) {
            throw new IllegalStateException("Game is already completed. Winners: " + winners);
        }

        Player currentPlayer = turnManager.current();
        int[] diceValues = dice.roll();
        int moveBy = 0;
        for (int val : diceValues) {
            moveBy += val;
        }

        int currentPosition = currentPlayer.getPosition();
        int newPosition = board.getNewPosition(currentPosition, moveBy);

        currentPlayer.setPosition(newPosition);

        // Check for win condition
        if (board.isLastPosition(newPosition)) {
            winners.add(currentPlayer);
            turnManager.removeCurrent();
            if (turnManager.size() == 1) {
                state = GameState.COMPLETED;
            }
        }
    }

    public synchronized List<String> getPlayerPositions() {
        List<String> positions = new LinkedList<>();
        CircularList<Player> tempTurnManager = new CircularList<>(new LinkedList<>(turnManager.getList()));
        int size = tempTurnManager.size();
        for (int i = 0; i < size; i++) {
            Player player = tempTurnManager.current();
            positions.add(player.getId() + ": " + player.getPosition());
        }
        return positions;
    }

}
