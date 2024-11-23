package hw14_oop_IT;

import java.util.Random;

public class TestAutomationEngineer extends Developer{
    public TestAutomationEngineer(String fullName) {
        super(fullName);
    }

    @Override
    boolean doHealthCheck() {
        Random random = new Random();

        boolean isTestCaseAvailable = random.nextBoolean();
        System.out.println("The test case available: "+ isTestCaseAvailable);
        return isTestCaseAvailable;

    }

    @Override
    void doesWork() {
        System.out.println(name+" is writing and running test cases");
    }
}
