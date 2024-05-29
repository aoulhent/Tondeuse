package com.kata.tondeuse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositionTest {

    @Test
    public void testMoveNorth() {
        Position position = new Position(1, 1);
        Position newPosition = position.move(Direction.N);
        assertEquals(new Position(1, 2), newPosition);
    }

    @Test
    public void testMoveEast() {
        Position position = new Position(1, 1);
        Position newPosition = position.move(Direction.E);
        assertEquals(new Position(2, 1), newPosition);
    }

    @Test
    public void testMoveSouth() {
        Position position = new Position(1, 1);
        Position newPosition = position.move(Direction.S);
        assertEquals(new Position(1, 0), newPosition);
    }

    @Test
    public void testMoveWest() {
        Position position = new Position(1, 1);
        Position newPosition = position.move(Direction.W);
        assertEquals(new Position(0, 1), newPosition);
    }
}
