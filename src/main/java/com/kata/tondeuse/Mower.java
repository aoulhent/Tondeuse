package com.kata.tondeuse;

public class Mower {
    private Position position;
    private Direction direction;
    private final BorderLimit borderLimit;

    public Mower(Position position, Direction direction, BorderLimit borderLimit) {
        this.position = position;
        this.direction = direction;
        this.borderLimit = borderLimit;
    }

    public void executeCommands(String commands) {
        for (char command : commands.toCharArray()) {
            switch (command) {
                case 'G': direction = direction.turnLeft(); break;
                case 'D': direction = direction.turnRight(); break;
                case 'A': moveForward(); break;
                default: throw new IllegalArgumentException("Unknown command: " + command);
            }
        }
    }

    private void moveForward() {
        Position newPosition = position.move(direction);
        if (borderLimit.isInside(newPosition)) {
            position = newPosition;
        }
    }

    public Position getPosition() {
        return position;
    }

    public Direction getDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return position + " " + direction;
    }
}

