 package ru.geekbrains.oop.lesson1;

import java.util.List;

import main.java.ru.geekbrains.oop.lesson1.Chocolate;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }
    public BottleOfWater getBottleOfWater(String name, double volume){
        for (Product product : products){
            if (product instanceof BottleOfWater){
                BottleOfWater bottleOfWater = (BottleOfWater)product;
                if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume)
                    return bottleOfWater;
            }
        }
        return null;
    }

    public Chocolate getChocolate(String name, int calories){
        for (Product product : products){
            if (product instanceof Chocolate){
                Chocolate barOfChocolate = (Chocolate)product;
                if (barOfChocolate.getName().equals(name) && barOfChocolate.getCalories() == calories)
                    return barOfChocolate;
            }
        }
        return null;
    }


}
