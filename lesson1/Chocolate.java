package main.java.ru.geekbrains.oop.lesson1;

import ru.geekbrains.oop.lesson1.Product;

public class Chocolate extends Product {
    private int calories;
    
    public int getCalories(){
        return calories;
    }
    public void setCalories(){
        this.calories = calories;
    }

    public Chocolate (String brand, String name, double price, int calories) {
        super(brand, name, price);
        this.calories = calories;
    }
    @Override
    public String displayInfo() {
        return String.format("Шоколадка\n\t[Производитель: %s\n\tНаименование: %s\n\tСтоимость: %.2f\n\tКалорийность: ]",
                brand, name, price, calories);
    }
}
