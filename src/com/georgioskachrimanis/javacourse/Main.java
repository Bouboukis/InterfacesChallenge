package com.georgioskachrimanis.javacourse;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player georgios = new Player("Georgios", 12, 14);
        System.out.println(georgios.toString());
        saveObject(georgios);

        georgios.setHitPoints(19);
        System.out.println(georgios);

        georgios.setWeapon("Thunderfurry");
        saveObject(georgios);
//        loadObject(georgios);
        System.out.println(georgios.getPlayersName());

        System.out.println("--------------------------------");
        ISaveable werewolf = new Monster("Werewolf ", 100, 20);
        ISaveable dian = new Player("Dina ", 9, 6);
        saveObject(werewolf);
        saveObject(dian);

        System.out.println("--------------------------------");
        System.out.println(werewolf);
        System.out.println(dian);

        System.out.println("--------------------------------");
        /* If we use the 'super class' to declare an object, we can not use the setters and getters in a normal way
        * we have to cast the object in order to make it work...See example: */
        System.out.println(((Monster) werewolf).getMonsterName());
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for (int i = 0; i <objectToSave.write().size() ; i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> valuesList = readValues();
        objectToLoad.read(valuesList);
    }
}
