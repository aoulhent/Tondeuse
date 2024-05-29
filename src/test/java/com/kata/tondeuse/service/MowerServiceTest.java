package com.kata.tondeuse.service;

import com.kata.tondeuse.Mower;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MowerServiceTest {

    @Autowired
    private MowerService mowerService;

    @Test
    public void testLoadMowersFromFile() throws Exception {
        List<Mower> mowers = mowerService.loadMowersFromFile("src/test/resources/input.txt");
        assertEquals("1 3 N", mowers.get(0).toString());
        assertEquals("5 1 E", mowers.get(1).toString());
    }
}
