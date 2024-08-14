package org.northcoders.food;

public class ImprovedFood implements NutritionalCalculator{


    @Override
    public double calculateProtein(double calories) {
        double proteinConversionFactor = 0.1;
        double baseProteinContent = 5.0;
        double protein = calories / 100.0 * proteinConversionFactor + baseProteinContent;
        return protein;
    }

    @Override
    public Vitamins calculateVitamins(double calories    ) {
        int vitaminA = (int) (calories / 10);
        int vitaminC = (int) (calories / 20);
        Vitamins vitamins =new Vitamins(vitaminA,vitaminC);
        return vitamins;

    }
}
