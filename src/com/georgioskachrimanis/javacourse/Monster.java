package com.georgioskachrimanis.javacourse;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String monsterName;
    private int hitPoints;
    private int strength;

    // Constructors
    public Monster(String monsterName, int hitPoints, int strength) {
        this.monsterName = monsterName;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    // Getters and Setters
    public String getMonsterName() {
        return monsterName;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    // Implemented methods
    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();

        values.add(0, this.monsterName);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);

        return values;
    }

    @Override
    public void read(List<String> listOfValues) {

        if (listOfValues != null && listOfValues.size() > 0) {
            this.monsterName = listOfValues.get(0);
            this.hitPoints = Integer.parseInt(listOfValues.get(1));
            this.strength = Integer.parseInt(listOfValues.get(2));
        }

    }

    // Methods
    @Override
    public String toString() {
        return "Monsters{" +
                "monsterName='" + monsterName + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

}
