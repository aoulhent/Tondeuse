package com.kata.tondeuse.service;

import com.kata.tondeuse.Direction;
import com.kata.tondeuse.BorderLimit;
import com.kata.tondeuse.Mower;
import com.kata.tondeuse.Position;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class MowerService {

    public List<Mower> loadMowersFromFile(String filePath) throws IOException {
        List<Mower> mowers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();
            String[] lawnDimensions = line.split(" ");
            BorderLimit borderLimit = new BorderLimit(Integer.parseInt(lawnDimensions[0]), Integer.parseInt(lawnDimensions[1]));

            while ((line = br.readLine()) != null) {
                String[] mowerPosition = line.split(" ");
                Position position = new Position(Integer.parseInt(mowerPosition[0]), Integer.parseInt(mowerPosition[1]));
                Direction direction = Direction.valueOf(mowerPosition[2]);
                Mower mower = new Mower(position, direction, borderLimit);
                String commands = br.readLine();
                mower.executeCommands(commands);
                mowers.add(mower);
            }
        }
        return mowers;
    }
}
