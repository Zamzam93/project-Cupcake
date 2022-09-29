import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList cupcakeMenu = new ArrayList<>();

        //creating an object or creating instance
        Cupcake cupcake = new Cupcake();

        RedVelvet redVelvet = new RedVelvet();
        Chocalate chocalate = new Chocalate();

        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on" +
                "\nthe menu but we need to decide on pricing");

        Scanner input = new Scanner(System.in);

        System.out.println("We are deciding on the price for our standard cupcake. Here is the description");



        cupcake.type();
        System.out.println("How much would you like to charge for the cupcake?");

        String priceText = input.nextLine();

        double price = Double.parseDouble(priceText);
        cupcake.setPrice(price);

        System.out.println("We are deciding on the price for our red velvet cupcake. Here is the description:");
        redVelvet.type();
        System.out.println("How much would you like to charge for the cupcake? + \n");

         priceText = input.next();
         price = Double.parseDouble(priceText);
        redVelvet.setPrice(price);

        System.out.println("We are deciding on the price for our red velvet cupcake. Here is the description:");
        chocalate.type();
        System.out.println("How much would you like to charge for the cupcake? + " +
                "\n");
         priceText = input.next();
        price = Double.parseDouble(priceText);
        chocalate.setPrice(price);

        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocalate);







    }

}