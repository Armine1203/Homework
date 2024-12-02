package hw17_ElectronicsShop;

public class Item {
    private String id;
    private String name;
    private double price;
    private Item gift;

    public Item(String id, String name, double price) {
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Item getGift() {
        return gift;
    }

    public void setGift(Item gift) {
        this.gift = gift;
    }
    public void removeGift(){
        this.setGift(null);
    }
    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", gift=" + gift +
                '}';
    }
}