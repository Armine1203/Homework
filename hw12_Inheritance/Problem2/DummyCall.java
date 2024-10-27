package hw12_Inheritance.Problem2;

public class DummyCall {
    private int callCounts = 0;
    private int [] durationOfEachCall = new int[10]  ;
    private String [] listOfCallMembers ;


    public  DummyCall(){
    }
    public DummyCall(String[] listOfCallMembers) {
        if (listOfCallMembers.length !=2){
            System.out.println("The member max count is 2");
            System.exit(5);
        }
        this.listOfCallMembers = listOfCallMembers;
    }
    public void makeCall(){
        System.out.println("Call started with " +getListOfCallMembers());
    }
    public void answerCall(){
        System.out.println("Call answered");
    }
    public void endCall(int duration){
        if (callCounts < durationOfEachCall.length) {
            durationOfEachCall[callCounts] = duration;
            callCounts++;
            System.out.println("Call ended with duration: " + duration + " seconds.");
        } else {
            System.out.println("Maximum call capacity reached.");
        }
    }
    public void endCall(){
        System.out.println("call ended");
        callCounts++;
    }

        public double getDurationOfCall(){
            return durationOfEachCall[durationOfEachCall.length-1];
   }

    public String[] getListOfCallMembers() {
        return listOfCallMembers;
    }

    public void setListOfCallMembers(String[] listOfCallMembers) {
        this.listOfCallMembers = listOfCallMembers;
    }
}
