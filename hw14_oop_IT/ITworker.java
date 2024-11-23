package hw14_oop_IT;

abstract public class ITworker {
    public String name;
    private String [] skills;
    public ITworker(String fullName){
        this.name = fullName;
    }
    public void getSkills() {
        System.out.print("skills:");
        for (String skill : skills) {
            System.out.print(skill+" ");
        }
    }
    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    abstract void doesWork();
}
