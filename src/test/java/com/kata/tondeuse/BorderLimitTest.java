package com.kata.tondeuse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BorderLimitTest {

    @Test
    public void testIsInside() {
        BorderLimit borderLimit = new BorderLimit(5, 5);
        assertTrue(borderLimit.isInside(new Position(0, 0)));
        assertTrue(borderLimit.isInside(new Position(5, 5)));
        assertFalse(borderLimit.isInside(new Position(6, 5)));
        assertFalse(borderLimit.isInside(new Position(5, 6)));
        assertFalse(borderLimit.isInside(new Position(-1, 0)));
        assertFalse(borderLimit.isInside(new Position(0, -1)));
    }
}
