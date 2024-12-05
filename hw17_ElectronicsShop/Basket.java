package hw17_ElectronicsShop;

public class Basket {
    private Item[] items;
    private int itemCount;
    private int giftCount;



    public Basket() {
        this.setItems(new Item[10]);
        itemCount = 0 ;
    }

    public void addItem(Item item) {
        if (itemCount >= items.length) {
            resizeArray();
        }
        items[itemCount++] = item;
    }

    private void resizeArray() {
        Item [] newItems = new Item[items.length +10];
        for (int i = 0; i < items.length ; i++) {
            newItems[i]  = items [i];
        }
        items = newItems;
    }

    public double calculateTotalPrice(){
        double totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getPrice();
        }
        return totalPrice;
    }

    public void checkout(double cardBalance) throws ExceptionForElectronicStore{
        giftCount = 0;
        for (int i = 0; i <itemCount ; i++) {
            if (items[i].getGift() != null){
                giftCount++;
            }

        }
        if (giftCount > 1) throw new ExceptionForElectronicStore(" Please remove a gift. Gift count more than 1");
        double totalPrice = calculateTotalPrice();
        System.out.println("totalPrice = "+totalPrice);
        if (cardBalance < totalPrice) {
            throw new ExceptionForElectronicStore("Insufficient funds");
        }
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public int getGiftCount() {
        return giftCount;
    }
}