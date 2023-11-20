package org.example;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static  void main(String[] args) throws URISyntaxException, IOException {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Chose an option: ");
            System.out.println("1. Display products");
            System.out.println("2. Add product");
            System.out.println("3. Delete product");
            System.out.println("4. Give three ideas for breakfast");
            System.out.println("5. Give three ideas for dinner");
            System.out.println("6. Recommend me healthy products which I can buy");
            System.out.println("7. Exit");


            int choice = Integer.parseInt(scanner.nextLine());
            ProductManager productManager = new ProductManager();
            ChatGPT chatGPT = new ChatGPT();

            switch (choice) {
                case 1 -> {
                    System.out.println("Products: ");

                    productManager.getAllProducts().forEach(System.out::println);
                }
                case 2 -> {
                    System.out.println("What product do you want to add?");
                    String product = scanner.nextLine();
                    productManager.addProduct(product);
                }
                case 3 -> {
                    System.out.println("What product do you want to delete?");

                    String product = scanner.nextLine();
                    productManager.deleteProduct(product);

                }
                case 4 -> {
                    System.out.println("Breakfast ideas from ChatGPT: ");
                    ChatGPTHelper chatGPTHelper = new ChatGPTHelper();
                    String breakfastIdeas = chatGPTHelper.getBreakfastIdeas(productManager.getAllProducts());
                    System.out.println(breakfastIdeas);


                }
                case 5 -> {
                    System.out.println("Dinner ideas from ChatGPT: ");


                }
                case 6 -> {
                    System.out.println("Healthy products from ChatGPT: ");

                }
                case 7 -> {
                    System.out.println("Bye!");
                    System.exit(0);

                }

            }
        }

    }
}


