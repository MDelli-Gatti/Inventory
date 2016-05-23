package com.theironyard;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {
        ArrayList<InventoryItem> items = new ArrayList<>();

        while (true){
            int i = 1;
            for (InventoryItem inventoryItem : items) {
                System.out.println(i + "." + " [" + inventoryItem.quantity + "] " + inventoryItem.item);
                i = i + 1;
            }
            System.out.println();
            System.out.println("Options:");
            System.out.println("1. Create a new item");
            System.out.println("2. Remove an item");
            System.out.println("3. Update an item's quantity");

            String selection = Main.scanner.nextLine();

            switch (selection) {
                case "1":
                    //create item
                    System.out.println("Enter your new item.");
                    String item = Main.scanner.nextLine();
                    System.out.println("Enter the quantity.");
                    String quantityStr = Main.scanner.nextLine();
                    int quantity = Integer.valueOf(quantityStr);
                    InventoryItem setItem = new InventoryItem(item, quantity);
                    items.add(setItem);
                    break;

                case "2":
                    //remove item
                    System.out.println("Which item number would you like to remove?");
                    String remove = Main.scanner.nextLine();
                    int num = Integer.valueOf(remove);
                    InventoryItem tempItem = items.get(num - 1);
                    items.remove(tempItem);
                    break;
                case "3":
                    //update quantity
                    System.out.println("Which item number would you like to update?");
                    String itemU = Main.scanner.nextLine();
                    int numb = Integer.valueOf(itemU);
                    InventoryItem tempItem1 = items.get(numb - 1);
                    System.out.println("What is the new quantity of " + itemU + "?");
                    String quan = Main.scanner.nextLine();
                    tempItem1.quantity = Integer.valueOf(quan);

                    break;
                default:
                    System.out.println("invalid selection");
            }


        }
    }
}
