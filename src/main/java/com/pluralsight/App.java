package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        ArrayList<Character> characters = new ArrayList<Character>();
        characters.add(new Character("Luke Skywalker", 172, 77, "blue", "male"));
        characters.add(new Character("Darth Vader", 202, 136, "yellow", "male"));
        characters.add(new Character("Leia Organa", 150, 49, "brown", "female"));
        characters.add(new Character("Anakin Skywalker", 188, 84, "blue", "male"));

        // 1. Print names in UPPERCASE using map and forEach
        characters.stream()
                .map(character -> character.getName().toUpperCase())
                .forEach(name -> System.out.println(name));

        // 2. Filter characters with mass > 80 using .filter and .collect(Collectors.toList())
        // store the results in a variable called heavyCharacters and display the new list
        List<Character> heavyCharacters = characters.stream() //we want to create a list for our filter
                .filter(character -> character.getMass() > 80)//filter by mass
                .toList();// once is done turn to list
        //loop through the list and get the name and mass of filtered mass and display it.
        heavyCharacters.forEach(character -> System.out.println(character.getName() + " " + character.getMass()));


        // 3. Create a new list of just character names using .filter and .collect(Collectors.toList())
        // the new list should be called names. Display the new list with a loop


        // 4. Use anyMatch to check for blue eyes and let us know if any character has blue eyes


        // 5. Use allMatch to check if all are male and let us know if all characters are male


        // 6. Use .mapToInt and .sum to calculate total mass of all characters and then display the total mass

    }


}
