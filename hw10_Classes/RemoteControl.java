package hw10_Classes;

public class RemoteControl{

    private SmartLight smartLight ;

    public RemoteControl(SmartLight smartLight){
        this.smartLight = smartLight;
    }
     public void resetLight(){
         smartLight.setOn(false);
         smartLight.setBrightness(50);
         smartLight.setColor("White");
     }

     public SmartLight getLightStatus(){
         return smartLight;
     }
     public void changeBrightness(int brightness){
         smartLight.setBrightness(brightness);
     }
}

