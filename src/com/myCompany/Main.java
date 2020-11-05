package com.myCompany;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<String> carBrandlStack = new Stack<>();
        carBrandlStack.push("LandRover");
        carBrandlStack.push("Lexus");
        carBrandlStack.push("Toyota");
        carBrandlStack.push("BMW");
        carBrandlStack.push("Audi");

        for (String brand : carBrandlStack){
            System.out.println(brand);
        }

        carBrandlStack.pop();

        System.out.println("Последний элемент: " + carBrandlStack.peek());
        System.out.println("Позиция первого добавленого эл-та LandRover:"
                + carBrandlStack.search("LandRover"));
    }
}
