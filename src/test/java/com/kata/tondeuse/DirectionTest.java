package com.kata.tondeuse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirectionTest {

    @Test
    public void testTurnLeft() {
        assertEquals(Direction.N.turnLeft(), Direction.W);
        assertEquals(Direction.W.turnLeft(), Direction.S);
        assertEquals(Direction.S.turnLeft(), Direction.E);
        assertEquals(Direction.E.turnLeft(), Direction.N);
    }

    @Test
    public void testTurnRight() {
        assertEquals(Direction.N.turnRight(), Direction.E);
        assertEquals(Direction.E.turnRight(), Direction.S);
        assertEquals(Direction.S.turnRight(), Direction.W);
        assertEquals(Direction.W.turnRight(), Direction.N);
    }
}
