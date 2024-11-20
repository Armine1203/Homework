package hw14_oop_IT;

import java.util.Random;

public class FullStackDeveloper extends Developer {
    public FullStackDeveloper(String fullName) {
        super(fullName);
    }

    @Override
    boolean doHealthCheck() {
        Random random = new Random();

        System.out.println("Calling to API {baseUrl}/fe/healthCheck");
        boolean randomFe = random.nextBoolean();

        System.out.println("Calling to API {baseUrl}/be/healthCheck");
        boolean randomeBe = random.nextBoolean();

        return randomFe && randomeBe;
    }

    @Override
    void doesWork() {
        System.out.println(name+" is writing code in frontend and backend parts");
    }
}
