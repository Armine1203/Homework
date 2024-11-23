package hw14_oop_IT;
public class Main {
    public static void main(String[] args) {
        String [] skils = {"Communication", "Leadership"};
        String [] ide = {"HTML", "CSS","JS"};
        Developer feDev = new FEdeveloper("ETHAN");
        feDev.setSkills(skils);
        feDev.setIDE(ide);

        Developer fullStack = new FullStackDeveloper("Bob");
        fullStack.setSkills(new String[]{"Communication", "Leadership","Risk Management"});
        fullStack.setIDE(new String[]{"Js","React","hTML","cSS"});

        Developer qa = new TestAutomationEngineer("Ann");
        qa.setSkills(new String[]{"Communication", "Leadership","Risk Management"});
        qa.setIDE(new String[]{"Selenium","TypeScript"});

        ITworker projectManager = new ProjectManager("Lili");
        projectManager.setSkills(new String[]{"Helpful","friendly"});

        Developer [] developers = {fullStack,feDev,qa};
        ITworker [] itWorkers = {fullStack,feDev,qa, projectManager};

        for (ITworker itworker: itWorkers) {
            itworker.doesWork();
        }
        System.out.println();
        for (Developer developer: developers) {
            System.out.println(developer.doHealthCheck());
            System.out.println();
        }
    }
}
