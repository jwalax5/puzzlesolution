package com.puzzlesolution;

import lombok.Data;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public enum Orb {
    RED,
    BLUE,
    GREEN,
    YELLOW,
    PURPLE,
    HEART,
    TOXIC,
    BOMB,
    DUST;

    public static Orb generateRandomOrb(){
        List<Orb> givenList = Arrays.asList(Orb.RED,Orb.BLUE,Orb.GREEN,Orb.YELLOW,Orb.PURPLE,Orb.HEART);
        Random rand = new Random();
        return givenList.get(rand.nextInt(givenList.size()));
    }
}
