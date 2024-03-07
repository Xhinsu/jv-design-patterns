package org.northcoders;

import org.northcoders.food.Food;
import org.northcoders.food.NutritionalCalculator;
import org.northcoders.food.Vitamins;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // PART ONE
        Person person = new Person("Juniper", "Doolittle", 30, "12 High Street", "01234-567890", "juniper@example.com");
        System.out.println(person);

        // PART TWO
//        ArrayList<Food> foods = new ArrayList<>(List.of(
//           new Food("Orange", 60),
//           new Food("Beef",  400),
//           new Food ("A stick", 3 ),
//           new Food("Pasta", 200)
//        ));
//
//        for(Food food : foods){
//            NutritionalCalculator nutritionalCalculator = new TODO(food); // TODO
//
//            double protein = nutritionalCalculator.calculateProtein();
//            Vitamins vitamins = nutritionalCalculator.calculateVitamins();
//
//            System.out.println("Protein in " + food.getName() +": " + protein + " grams");
//            System.out.println("Vitamins in " + food.getName() + ": Vitamin A=" + vitamins.getVitaminA());
//        }



    }
}