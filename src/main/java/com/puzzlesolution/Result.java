package com.puzzlesolution;

import com.puzzlesolution.Coordination;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Result {
    // combo , path record, shape
    private int combo;

    // map <com.puzzlesolution.Shape: count>
    private Map<Shape, Integer> shapeCountMap;

    // i need list with insertion order , trace the path movement
    private List<Coordination> path = new ArrayList<>();

    public Result(int combo, Map<Shape, Integer> shapeCountMap, ArrayList<Coordination> path) {
        this.combo = combo;
        this.shapeCountMap = shapeCountMap;
        this.path = path;
    }
}
