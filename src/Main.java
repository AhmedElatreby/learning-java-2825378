package src;

import java.util.Scanner;

public class Main {

    public static void calculateTotalMealCost(double listedMealPrice,
                                              double tipRate,
                                              double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        System.out.println("Your total meal price is " + result);

        
    }

    public static void main(String[] args) {
        calculateTotalMealCost(15,.2,.08);

    }



}
