package org.sysdesign.board;

import java.util.Map;

public class Board {

    // this class will be representing the board
    // It will have the size of the board
    // Here are its responsibilities
    /*
    1. It will have the size of the board.
    2. It will have the snakes and ladders on the board.
    3. It will validate the board before creating its object.
    The validation  meaning:
        a. In any position there can not be entry point of more than one snake or ladder.
        b. There should not be a cycle in the board. I mean the snake and ladder should not form a cycle.
        c. The last position should not contain any entry point of snake or ladder.
        d. The snake should always go down and ladder should always go up.
    4. It will expose a method which will return the new position of the player given the current position of the player and the dice value.
    5. It will expose a method through which we should be able to get the state of the board. Through json or any other way
    6. Given a position, the board will say if it is the last position or not. Through this we will be finding out if the player has won or not.

    How do we build the board object?
    We will be passing the size of the board, list of snakes and ladders to the constructor of the board. Or we can have a builder class for it.
     */


    private final int size;

    // Create a map which will store the start position and the SnakeLadder object. This means that at this start position there is a snake or ladder
    private final Map<Integer, SnakeLadder> snakeLadderMap;

    public Board(int size, Map<Integer, SnakeLadder> snakeLadderMap) {
        this.size = size;
        this.snakeLadderMap = snakeLadderMap;
        validateBoard();
    }


    // validate board will do the following
    // 1. Check if there is any entry point of more than one snake or ladder
    // 2. Check if there is any cycle in the board
    // 3. Check if the last position contains any entry point of snake or ladder - This is validated by map itself
    private void validateBoard() {
        // Check if the last position contains any entry point of snake or ladder
        if (snakeLadderMap.containsKey(size)) {
            throw new IllegalArgumentException("Last position cannot contain entry point of snake or ladder");
        }

        // Check if the snake and ladder are valid
        for (SnakeLadder sl : snakeLadderMap.values()) {
            if (sl.getType() == ObjectType.SNAKE) {
                if (sl.getStart() <= sl.getEnd()) {
                    throw new IllegalArgumentException("Invalid snake from " + sl.getStart() + " to " + sl.getEnd());
                }
            } else {
                if (sl.getStart() >= sl.getEnd()) {
                    throw new IllegalArgumentException("Invalid ladder from " + sl.getStart() + " to " + sl.getEnd());
                }
            }
        }

        // Check for cycles using DFS or BFS
        boolean[] visited = new boolean[size + 1];
        for (Integer start : snakeLadderMap.keySet()) {

            if (visited[start]) {
                continue;
            }

            int current = start;
            while (snakeLadderMap.containsKey(current)) {
                if (visited[current]) {
                    throw new IllegalArgumentException("Cycle detected in the board");
                }
                visited[current] = true;
                current = snakeLadderMap.get(current).getEnd();
            }

        }

    }

    public int getSize() {
        return size;
    }

    public Map<Integer, SnakeLadder> getSnakeLadderMap() {
        return snakeLadderMap;
    }

    // Given the current position of the player and the dice value, return the new position of the player
    public int getNewPosition(int currentPosition, int diceValue) {
        int newPosition = currentPosition + diceValue;
        if (newPosition > size) {
            return currentPosition; // Player cannot move
        }
        while (snakeLadderMap.containsKey(newPosition)) {
            newPosition = snakeLadderMap.get(newPosition).getEnd();
        }

        return newPosition;
    }

    // Check if the given position is the last position
    public boolean isLastPosition(int position) {
        return position == size;
    }

}
