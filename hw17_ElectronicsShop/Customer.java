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


    public  void checkout(){
        try {
            basket.checkout(balance);
            System.out.println("successfully!!!!!!!!!!");
        } catch (ExceptionForElectronicStore e) {
            System.out.println(e.getMessage());
            if (basket.getGiftCount()>1) {
                for (Item item : basket.getItems()) {
                    if (item.getGift() != null) {
                        item.removeGift();
                        break;
                    }
                }
                try {
                    basket.checkout(balance);
                    System.out.println(basket.getGiftCount()+" giftCount");
                    System.out.println("successfully!!!!!!!!");
                } catch (ExceptionForElectronicStore exceptionForElectronicStore) {
                    System.out.println(exceptionForElectronicStore.getMessage());
                    throw exceptionForElectronicStore;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "basket=" + basket +
                '}';
    }
}
