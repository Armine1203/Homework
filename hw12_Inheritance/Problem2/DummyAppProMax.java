package hw12_Inheritance.Problem2;

public class DummyAppProMax extends DummyAppPro{
    private boolean isScreenSharingEnabled;

    public DummyAppProMax(String[] listOfCallMembers) {
        super(listOfCallMembers);
        this.isScreenSharingEnabled = false;
    }

    public boolean isScreenSharingEnabled() {
        return isScreenSharingEnabled;
    }

    public void setScreenSharingEnabled(boolean screenSharingEnabled) {
        isScreenSharingEnabled = screenSharingEnabled;
    }

    public void OnScreenSharing(){
        if (!isScreenSharingEnabled()){
            setScreenSharingEnabled(true);
            System.out.println("Screen Sharing is on");
        }
    }
    public void OffScreenSharing(){
        if (isScreenSharingEnabled()){
            setScreenSharingEnabled(false);
            System.out.println("Screen Sharing is off");
        }
    }



}

