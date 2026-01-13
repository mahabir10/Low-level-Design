package org.sysdesign;

import org.sysdesign.board.Board;
import org.sysdesign.board.SnakeLadder;

import java.util.HashMap;
import java.util.Map;

import static org.sysdesign.board.ObjectType.LADDER;
import static org.sysdesign.board.ObjectType.SNAKE;

public class Main {
    public static void main(String[] args) {


        // We will simulate the game here
        System.out.println("Welcome to Snake and Ladder Game!");

        Map<Integer, SnakeLadder> snakeLadderMap = new HashMap<>();

        snakeLadderMap.put(14, new SnakeLadder(14, 7, SNAKE));
        snakeLadderMap.put(31, new SnakeLadder(31, 26, SNAKE));
        snakeLadderMap.put(38, new SnakeLadder(38, 3, SNAKE));
        snakeLadderMap.put(84, new SnakeLadder(84, 58, SNAKE));
        // PUt ladders
        snakeLadderMap.put(4, new SnakeLadder(4, 25, LADDER));
        snakeLadderMap.put(13, new SnakeLadder(13, 46, LADDER));
        snakeLadderMap.put(33, new SnakeLadder(33, 49, LADDER));
        snakeLadderMap.put(42, new SnakeLadder(42, 63, LADDER));
        snakeLadderMap.put(50, new SnakeLadder(50, 69, LADDER));

        Board board = new Board(100, snakeLadderMap);
        Game game = new Game(board, 2, new Dice(1));

        // Start the game

        System.out.println(game.getPlayerPositions());
        while (game.getState() == Game.GameState.IN_PROGRESS) {
            game.makeMove();
            System.out.println(game.getPlayerPositions());
        }

        System.out.println("Game Over!");
        // Announce winners
        System.out.println("Winners in order:");
        int rank = 1;
        for (Player winner : game.getWinners()) {
            System.out.println("Rank " + rank + ": " + winner.getId());
            rank++;
        }

    }
}