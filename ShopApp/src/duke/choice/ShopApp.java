package duke.choice;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ShopApp {

    public static void main(String[] args) {

        double tax = 0.2;
        double total = 0.0;

        System.out.println("Welcome to Duke Choice Shop!");

        Customer c1 = new Customer("Pinky", 3);
        //c1.setName("Pinky");
        //c1.setSize("S");

        System.out.println("Min Price " + Clothing.MIN_PRICE);

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing[] items = {item1, item2, new Clothing("Green Scarf", 5, "S"), new Clothing("Blue T-Shirt", 10.5, "S")};

//        System.out.println("item 1," + item1.description + "," + item1.price + "," + item1.size);
//        System.out.println("item 2," + item2.description + "," + item2.price + "," + item2.size);
//        total = (item1.price + item2.price*2) * (1+tax);
        int measurement = 8;
        c1.addItems(items);

        //c1.setSize(measurement);
        System.out.println("Customer is " + c1.getName() + "," + c1.getSize() + "," + c1.getTotalClothingCost());

        for (Clothing item: c1.getItems()){
//            System.out.println("Items " + item.getDescription() + "," + item.getSize() + "," + item.getPrice());
            System.out.println("Item output " + item);
        }

        int average = 0;            //practise 7.1
        int count = 0;              //practise 7.1

        for (Clothing item : c1.getItems()) {           //practise 7.1
            if (item.getSize().equals("L")){
                count++;                                    //practise 7.1
                average += item.getPrice();                 //practise 7.1
            }
        }

        try{
            average = (count == 0) ? 0 : average/count;
            average = average / count;
            System.out.println("Average price " + average + ", Count " + count);        //practise 7.1
        }catch (ArithmeticException e){
            System.out.println("Do not divide by zero!");
        }

        Arrays.sort(c1.getItems());
        for (Clothing item: c1.getItems()){
//            System.out.println("Items " + item.getDescription() + "," + item.getSize() + "," + item.getPrice());
            System.out.println("Item output " + item);
        }
    }
}
