package hw17_ElectronicsShop;

public class Customer {
    private String name;
    private Basket basket;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.basket = new Basket();
    }

    public String getName() {
        return name;
    }

    public Basket getBasket() {
        return basket;
    }

    public double getBalance() {
        return balance;
    }

    public void addItemToBasket(Item item) {
        basket.addItem(item);
    }


    public void checkout() {
        try {
            basket.checkout(balance);
        } catch (ExceptionForElectronicStore e) {
            System.out.println(e.getMessage());
            if (basket.getGiftCount() > 1) {
                basket.removeGift();
            }
            try {
                basket.checkout(balance);
                System.out.println(basket.getGiftCount() + " giftCount");
                System.out.println("successfully!!!!!!!!");
            } catch (ExceptionForElectronicStore exceptionForElectronicStore) {
                System.out.println(exceptionForElectronicStore.getMessage());
                throw exceptionForElectronicStore;
            }
        }

    }


    public void isAgreeToReceiveGift(Item item, Item gift, String answer) {
        if (answer.toLowerCase().equals("yes")) {
            basket.setGift(gift);
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "basket=" + basket +
                '}';
    }
}
