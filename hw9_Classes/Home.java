package hw9_Classes;

public class Home {
    private double livingRoom;
    private double bedroom;
    private double kitchen;
    private double bathroom;
    private double hallWay;

    public Home(double livingRoom, double bedroom, double kitchen, double bathroom, double hallWay) {
        if (livingRoom <= 0 || bedroom <= 0 || kitchen <= 0 || bathroom <= 0 || hallWay <= 0){
            System.out.println("Invalid dimensions. Please enter again");
            System.exit(0);
        }

        this.livingRoom = livingRoom;
        this.bedroom = bedroom;
        this.kitchen = kitchen;
        this.bathroom = bathroom;
        this.hallWay = hallWay;
    }

    public Home(double livingRoom, double bedroom, double kitchen, double hallWay) {
        this(livingRoom, bedroom, kitchen, 5, hallWay);
    }
}
