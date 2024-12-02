package hw17_ElectronicsShop;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        Scanner scanner = new Scanner(System.in);
        Laptop laptop = new Laptop("1", "Laptop", 150_000);
        Phone phone = new Phone("2", "Phone", 100_000);
        Phone phone2 = new Phone("4", "Phone4", 10_000_000);
        TV tv = new TV("3", "TV", 200_000);
        HairDryer hairDryer = new HairDryer("4", "Hair Dryer", 30_000);


        System.out.print("Do you want to receive a phone  with the laptop as a gift? Enter y or n ");
        String response1 = scanner.next();
        if (response1.equals("y")) {
            laptop.setGift(phone);
        }

        String response2 = scanner.next();
        System.out.print("Do you want to receive a hair  dryer with the TV? Enter y or n  ");
        if (response2.equals("y")){
            tv.setGift(hairDryer);
        }

        basket.addItem(laptop);
        basket.addItem(tv);
        scanner.next();
//        System.out.println(laptop.getGift().toString());
//        System.out.println(tv.getGift().toString());

        System.out.print("Enter card balance ");
        double cardBalance = scanner.nextDouble();

        try {
            basket.checkout(cardBalance);
            System.out.println("successfully!!!!!!!!!!");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            if (basket.getGiftCount()>1) {
                System.out.print("Enter item's IT , which you want to remove from gifts ");
                String itemId = scanner.next();
                for (Item item : basket.getItems()) {
                    if (item.getId().equals(itemId)) {
                        item.removeGift();
                        break;
                    }
                }
                try {
                    basket.checkout(cardBalance);
                    System.out.println(basket.getGiftCount()+" giftCount");
                    System.out.println("successfully!!!!!!!!");
                } catch (RuntimeException runtimeException) {
                    System.out.println(runtimeException.getMessage());
                    throw runtimeException;
                }
            }
        }
    }
}