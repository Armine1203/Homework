package hw17_ElectronicsShop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Me", 100_000_000);
        Item laptop = Item.LAPTOP;
        Item phone = Item.PHONE;
        Item tv = Item.TV;
        Item hairDryer = Item.HAIRDRYER;

        laptop.isAgreeToReceiveGift(laptop, phone, "YES");
        tv.isAgreeToReceiveGift(laptop, hairDryer, "yEs");
        customer.addItemToBasket(laptop);
        customer.addItemToBasket(tv);

        customer.checkout();
        //System.out.println(customer.getBasket().toString());

    }
}