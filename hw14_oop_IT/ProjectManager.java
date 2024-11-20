package hw14_oop_IT;

public class ProjectManager extends ITworker {
    public ProjectManager(String fullName) {
        super(fullName);
    }


    @Override
    void doesWork() {
        System.out.println(name + " is managing the project");
    }
}
