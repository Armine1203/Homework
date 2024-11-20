package hw14_oop_IT;

import java.util.Random;

public class FEdeveloper extends Developer {
    public FEdeveloper(String fullName) {
        super(fullName);
    }

    @Override
    boolean doHealthCheck() {
        System.out.println("Calling to API {baseUrl}/fe/healthCheck");
        Random random = new Random();
        boolean randomfe = random.nextBoolean();
        return randomfe;
    }

    @Override
    void doesWork() {
        System.out.println(name + " is writing frontend code");
    }
}
