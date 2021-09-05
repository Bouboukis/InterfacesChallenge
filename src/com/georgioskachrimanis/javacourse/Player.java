package com.georgioskachrimanis.javacourse;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{

    private String playersName;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String playersName, int hitPoints, int strength) {
        this.playersName = playersName;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Club";
    }

    // Getters and Setters
    public String getPlayersName() {
        return playersName;
    }

    public void setPlayersName(String playersName) {
        this.playersName = playersName;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    // Implemented Methods
    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.playersName);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);
        values.add(3, this.weapon);

        return values;
    }

    @Override
    public void read(List<String> listOfValues) {
        if (listOfValues != null && listOfValues.size() > 0) {
            this.playersName = listOfValues.get(0);
            this.hitPoints = Integer.parseInt(listOfValues.get(1));
            this.strength = Integer.parseInt(listOfValues.get(2));
            this.weapon = listOfValues.get(3);
        }

    }

    // Methods
    @Override
    public String toString() {
        return "Players{" +
                "Player Name='" + playersName + '\'' +
                ", hit points=" + hitPoints +
                ", Strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

}
