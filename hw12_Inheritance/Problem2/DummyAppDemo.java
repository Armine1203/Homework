package hw12_Inheritance.Problem2;

public class DummyAppDemo {
    public static void main(String[] args) {
        String[] callMembers = {"Alina", "Arman"};
        DummyCall dummyCall = new DummyCall(callMembers);
        dummyCall.makeCall();
        dummyCall.answerCall();
        dummyCall.endCall(150);
        System.out.println("Last call duration: " + dummyCall.getDurationOfCall() + " seconds");

        System.out.println("------------------------------------------------------------------------------");

        String[] videoCallMembers = {"Aram", "Ani", "Karen", "Mariam"};
        DummyAppPro dummyAppProCall = new DummyAppPro(videoCallMembers);
        dummyAppProCall.makeCall();
        dummyAppProCall.answerCall();
        System.out.println("video call status is" + dummyAppProCall.isVideoCallEnabled());
        dummyAppProCall.toggleCamera();
        System.out.println("video call status is" + dummyAppProCall.isVideoCallEnabled());
        dummyAppProCall.toggleCamera();
        System.out.println("video call status is" + dummyAppProCall.isVideoCallEnabled());
        dummyAppProCall.endCall(300);
        System.out.println("Last call duration is" + dummyAppProCall.getDurationOfCall() + " seconds");

        System.out.println("----------------------------------------------------------------------");
        String[] proMaxCallMembers = {"Aram", "Ani", "Karen", "Mariam", "Suren"};
        DummyAppProMax dummyAppProMaxCall = new DummyAppProMax(proMaxCallMembers);
        dummyAppProMaxCall.makeCall();
        dummyAppProMaxCall.answerCall();
        System.out.println("screen sharing status " + dummyAppProMaxCall.isScreenSharingEnabled());
        dummyAppProMaxCall.OnScreenSharing();
        dummyAppProMaxCall.OffScreenSharing();
        dummyAppProMaxCall.endCall(400);
        System.out.println("Last call duration: " + dummyAppProMaxCall.getDurationOfCall() + " seconds");
    }
}
