package edu.Domile;


import java.text.DecimalFormat;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RecipePrompt {

    public void run() {
        printMenu();
    }

    private void prompt() {
        Float amount = promptAmount();
        String unit = promptUnit();
        String unitToConvert = promptUnitToConvert();
        CookingMeasurement conversionResult = CookingMeasurementConverter.convert(new CookingMeasurement(unit, amount), unitToConvert);
        print(conversionResult);
    }

    public Float promptAmount() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("1. Enter amount.");
        return myObj.nextFloat();
    }

    public String promptUnit() {
        System.out.println("Enter unit");
        Scanner myObj = new Scanner(System.in);
        String unit = myObj.nextLine();
        unit = unit.toUpperCase();
        while (!Cooking.Units.isValid(unit)) {
            System.out.println("You have entered wrong value. Try again.");
            promptUnit();
        }
        return unit;
    }

    public String promptUnitToConvert() {
        System.out.println("Enter unit to which you would like to convert.");
        Scanner myObj = new Scanner(System.in);
        String unit = myObj.nextLine();
        unit = unit.toUpperCase();
        while (!Cooking.Units.isValid(unit)) {
            System.out.println("You have entered wrong value. Try again.");
            promptUnitToConvert();
        }
        return unit;
    }

    public void printMenu() {
        System.out.println("1 - Basic conversion of a measurement.\n" +
                "2 - Recipe processing.\n" +
                "3 - Quit.");
        Scanner myObj = new Scanner(System.in);
        try {
            int amount = myObj.nextInt();
            switch (amount) {
                case 1:
                    prompt();
                    break;
                case 2:
                    insertRecipe();
                    break;
                case 3:
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("You have entered wrong value, please enter desired number from the menu.");
            printMenu();
        }
    }

    private void insertRecipe() {
        List<CookingMeasurement> measurementsAmount = new ArrayList<>();
        System.out.println("Please enter your recipe:");
        Scanner myObj = new Scanner(System.in);
        String recipe = myObj.nextLine();
        String reg = " ";
        String[] arrayFromRecipe = recipe.split(reg);
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        for (int i = 0; i < arrayFromRecipe.length; i++) {
            String x = arrayFromRecipe[i];
            if (pattern.matcher(x).matches()) {
                int finalI = i;
                Float amount = Float.parseFloat(x);
                List<String> units = Arrays.stream(arrayFromRecipe).
                        filter(a -> a.equals(arrayFromRecipe[finalI + 1])).
                        map(String::toUpperCase).
                        collect(Collectors.toList());
                String unit = units.get(0);
                measurementsAmount.add(new CookingMeasurement(unit, amount));
            }
        }
        List<CookingMeasurement> resultList = measurementsAmount.stream().
                map(a -> CookingMeasurementConverter.convert(a, "ML")).
                collect(Collectors.toList());
        resultList.stream().forEach(System.out::println);
    }

    private void print(CookingMeasurement cookingMeasurement) {
        DecimalFormat df = new DecimalFormat("0.00");
        double numb = Math.round(cookingMeasurement.getAmount() * 100.00) / 100.00;
        System.out.println("Converted amount equals " + numb +
                " " + cookingMeasurement.getUnit() + ".");
    }


}