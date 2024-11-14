package hw12_Inheritance.Problem2;

public class DummyAppPro extends DummyCall {
    private boolean isVideoCallEnabled ;
    private static final int MAX_COUNT_OF_MEMBERS = 10;


    public DummyAppPro(String[] listOfCallMembers) {
        super();
        if (listOfCallMembers.length < 2 || listOfCallMembers.length > MAX_COUNT_OF_MEMBERS) {
            System.out.println("The member max count is 10");
            System.exit(5);
        }
        this.setListOfCallMembers(listOfCallMembers);
        this.setVideoCallEnabled(false);
    }


    public boolean isVideoCallEnabled() {
        return isVideoCallEnabled;
    }
    public void setVideoCallEnabled(boolean videoCallEnabled) {
        isVideoCallEnabled = videoCallEnabled;
    }

    public void toggleCamera(){
        isVideoCallEnabled = !isVideoCallEnabled;
    }
    public void removeObjects(){
        super.endCall();
        this.setListOfCallMembers(null);
    }
}
