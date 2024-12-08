package hw17_ElectronicsShop;

public enum Item {
   LAPTOP("1", "Laptop", 150_000),
    PHONE("2", "Phone", 100_000),
    TV("3", "TV", 200_000),
    HAIRDRYER("4", "Hair Dryer", 30_000) ;

    private String id;
    private String name;
    private double price;

    private Item(String id, String name, double price) {//դեֆոլտ փրայվիթ է//
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

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}