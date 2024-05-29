package com.kata.tondeuse;

public class BorderLimit {
    private final int maxX;
    private final int maxY;

    public BorderLimit(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public boolean isInside(Position position) {
        return position.getX() >= 0 && position.getX() <= maxX && position.getY() >= 0 && position.getY() <= maxY;
    }
}

