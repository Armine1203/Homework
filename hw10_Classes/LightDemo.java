package hw10_Classes;

public class LightDemo {
    public static void main(String[] args) {
        SmartLight smartLight1 = new SmartLight(false, 10, "yellow");
        SmartLight smartLight2 = new SmartLight(true, 25, "orange");
        RemoteControl remoteControl = new RemoteControl(smartLight1);

//      smartLight1.setBrightness(200);
        smartLight1.setBrightness(15);
        System.out.println(smartLight1.getBrightness());

        remoteControl.changeBrightness(50);
        System.out.println(smartLight1.getBrightness());

        remoteControl.resetLight();
        System.out.println(smartLight2.isOn() + " " + smartLight2.getBrightness() + " " + smartLight2.getColor());

        SmartLight smartLight3 = remoteControl.getLightStatus();
        System.out.println(smartLight3.getColor());//yellow

        smartLight1.toggle();
        System.out.println(smartLight1.isOn());
        System.out.println(smartLight3.isOn());

        smartLight1.setColor("Pink");
        System.out.println(smartLight1.getColor());
        System.out.println(smartLight3.getColor());



    }
}
