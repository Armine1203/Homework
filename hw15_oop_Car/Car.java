package hw15_oop_Car;

public abstract class Car {
    public String carModel;
    boolean inGas = false;
    //քանի որ ինտերֆեյսի մեջ տրված
    // փոփոխականը ֆայնլ էր լինելու , հայտարարել եմ այստեղ և սկզբնական
    // արժեքը տվել եմ ֆոլս, որ մոտոցիկլը ժառանգի այն

    Car(String carModel){
        this.carModel = carModel;
    }


    public void printCarModel(){
        System.out.println(carModel);
    }
    public abstract void  startDriving();
}
