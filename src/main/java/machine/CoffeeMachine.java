package machine;

import java.util.Scanner;

public class CoffeeMachine {

    private static final Scanner scanner = new Scanner(System.in);
    private static final int WATER = 200;
    private static final int MILK = 50;
    private static final int BEANS = 15;

    private static int waterSupply = 400;
    private static int milkSupply = 540;
    private static int beansSupply = 120;
    private static int earnings = 550;
    private static int cups = 9;

    private static void printState() {

        System.out.println("The coffee machine has:");

        System.out.println(waterSupply + " ml of water");
        System.out.println(milkSupply + " ml of milk");
        System.out.println(beansSupply + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + earnings + " of money");
    }

    public static void main(String... args) {

//        int availableWater;
//        int availableMilk;
//        int availableCoffee;
//        int cupsNeeded;

//        System.out.println("Starting to make a coffee");
//        System.out.println("Grinding coffee beans");
//        System.out.println("Boiling water");
//        System.out.println("Mixing boiled water with crushed coffee beans");
//        System.out.println("Pouring coffee into the cup");
//        System.out.println("Pouring some milk into the cup");
//        System.out.println("Coffee is ready!");
//
//        System.out.println("Write how many cups of coffee you will need: ");
//        int cups = scanner.nextInt();
//        System.out.println("For " + cups + " cups of coffee you will need: ");
//        System.out.println(WATER * cups + " ml of water");
//        System.out.println(MILK * cups + " ml of milk");
//        System.out.println(BEANS * cups + " g of coffee beans");

//        System.out.println("Write how many ml of water the coffee machine has: ");
//        availableWater = scanner.nextInt();
//        System.out.println("Write how many ml of milk the coffee machine has: ");
//        availableMilk = scanner.nextInt();
//        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
//        availableCoffee = scanner.nextInt();
//
//        System.out.println("Write how many cups of coffee you will need: ");
//        cupsNeeded = scanner.nextInt();
//
//        int counter = 0;
//        while(availableWater >= WATER && availableMilk >= MILK && availableCoffee >= BEANS) {
//            counter++;
//            availableWater -= WATER;
//            availableMilk -= MILK;
//            availableCoffee -= BEANS;
//        }
//
//        if(counter == cupsNeeded) {
//            System.out.println("Yes, I can make that amount of coffee");
//        } else if (counter < cupsNeeded) {
//            System.out.println("No, I can make only " + counter + " cup(s) of coffee");
//        } else {
//            System.out.println("Yes, I can make that amount of coffee (and even " + (counter - cupsNeeded) + " more than that)");
//        }



    }

}
