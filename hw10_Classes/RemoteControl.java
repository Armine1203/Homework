package hw10_Classes;

public class RemoteControl{

    private SmartLight smartLight ;

    public RemoteControl(SmartLight smartLight){
        this.smartLight = smartLight;
    }
     public void resetLight(SmartLight smartLight1){
         smartLight1.setOn(false);
         smartLight1.setBrightness(50);
         smartLight1.setColor("White");
     }

     public SmartLight getLightStatus(){
         return smartLight;
     }
     public void changeBrightness(int brightness){
         smartLight.setBrightness(brightness);
     }
}
