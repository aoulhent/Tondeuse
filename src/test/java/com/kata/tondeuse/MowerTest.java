package com.kata.tondeuse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MowerTest {

    @Test
    public void testMowerInitialization() {
        BorderLimit borderLimit = new BorderLimit(5, 5);
        Position position = new Position(1, 2);
        Mower mower = new Mower(position, Direction.N, borderLimit);
        assertEquals(1, mower.getPosition().getX());
        assertEquals(2, mower.getPosition().getY());
        assertEquals(Direction.N, mower.getDirection());
    }

    @Test
    public void testMowerMovement() {
        BorderLimit borderLimit = new BorderLimit(5, 5);
        Position position = new Position(1, 2);
        Mower mower = new Mower(position, Direction.N, borderLimit);
        mower.executeCommands("GAGAGAGAA");
        assertEquals(1, mower.getPosition().getX());
        assertEquals(3, mower.getPosition().getY());
        assertEquals(Direction.N, mower.getDirection());
    }

    @Test
    public void testMowerBoundary() {
        BorderLimit borderLimit = new BorderLimit(5, 5);
        Position position = new Position(5, 5);
        Mower mower = new Mower(position, Direction.N, borderLimit);
        mower.executeCommands("A");
        assertEquals(5, mower.getPosition().getX());
        assertEquals(5, mower.getPosition().getY());
        assertEquals(Direction.N, mower.getDirection());
    }
}
