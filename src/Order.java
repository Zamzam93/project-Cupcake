import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    public Order (ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu) {
        System.out.println("Hello customer. Would you like to place an order? (Y or N)");

        Scanner scan = new Scanner(System.in);
        String placeOrder = scan.nextLine();

        ArrayList order = new ArrayList<>();

        System.out.println(placeOrder);

        if(placeOrder == "Y"){

        }else{
            System.out.println("Have a nice day then.");
        }

         order.add(LocalDate.now());

        System.out.println("Here is the menu.");
        System.out.println("CUPCAKES:");

        int itemNumber = 0;

        for (int i = 0; i < cupcakeMenu.size(); i++){
            cupcakeMenu.get(i);
            cupcakeMenu.get(i).type();

            itemNumber++;
        }
        System.out.println(itemNumber);

        System.out.println("DRINKS:");



        for (int i = 0; i < drinkMenu.size(); i++){



            itemNumber++;


            System.out.println(itemNumber + ".");


            drinkMenu.get(i).type();

            System.out.println("Price: $" + drinkMenu.get(i).getPrice());

            System.out.println();

        }

        boolean ordering = true;

        while (ordering) {

        }





    }

}
