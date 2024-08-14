package org.northcoders;

import org.northcoders.config.ConfigManager;
import org.northcoders.database.ImaginaryDatabase;
import org.northcoders.food.Food;
import org.northcoders.food.ImprovedFood;
import org.northcoders.food.NutritionalCalculator;
import org.northcoders.food.Vitamins;
import org.northcoders.transport.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        var config = ConfigManager.getInstance();


        // PART ONE
        // Person person = new Person("Juniper", "Doolittle", 30, "12 High Street", "01234-567890", "juniper@example.com");

//        Person person = new Person.PersonBuilder("Kenny", "Smith", 27)
//                .email("email@email.com")
//                .addressMethod("ADDRESS")
//                .phoneNumber("0770777077077")
//                .build();
//
//        System.out.println(person);
//
        config.incrementDataCount();

//        // PART TWO
//        ArrayList<Food> foods = new ArrayList<>(List.of(
//           new Food("Orange", 60),
//           new Food("Beef",  400),
//           new Food ("A stick", 3 ),
//           new Food("Pasta", 200)
//        ));
//
//
//
//        for(Food food : foods){
//            NutritionalCalculator nutritionalCalculator = new ImprovedFood();
//
//            double protein = nutritionalCalculator.calculateProtein(food.getCalories());
//            Vitamins vitamins = nutritionalCalculator.calculateVitamins(food.getCalories());
//
//            System.out.println("Protein in " + food.getName() +": " + protein + " grams");
//            System.out.println("Vitamins in " + food.getName() + ": Vitamin A=" + vitamins.getVitaminA());
//        }
            config.incrementDataCount(); // ignore this for now
//
//         // PART THREE

         ImaginaryDatabase.flushDataQueue();

        // PART FOUR
//        Transport basicTransport = new BasicTransport("Basic");
//        basicTransport.display();

        

    }
}