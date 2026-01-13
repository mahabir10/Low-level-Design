package org.sysdesign.board;

public class SnakeLadder {

    // This class will be representing the snake and ladder on the board
    // It will expose a method which will return the new position of the player - we know the current position of the player

    private ObjectType type; // Snake or Ladder
    private final int start;
    private final int end;

    public SnakeLadder(int start, int end, ObjectType type) {
        this.start = start;
        this.end = end;
        this.type = type;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public ObjectType getType() {
        return type;
    }

}
