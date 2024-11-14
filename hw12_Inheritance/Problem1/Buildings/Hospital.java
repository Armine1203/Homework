package hw12_Inheritance.Problem1.Buildings;

import hw12_Inheritance.Problem1.People.Doctor;
import hw12_Inheritance.Problem1.People.Student;
import hw12_Inheritance.Problem1.People.Teacher;

public class Hospital extends Building {
    private int rooms;
    private String[] diseases = new String[6];
    private Doctor[] staff;
    private int currentDiseasCount = 0;
    private int currentStaffCount = 0;


    public Hospital(){}
    public Hospital(int drainageSystem, int voltage, int rooms, int maxDoctorCount ) {
        super(drainageSystem, voltage);
        this.rooms = rooms;
        this.setDoctorsLength(maxDoctorCount);
    }

    public  void setDoctorsLength(int length){
        staff = new Doctor[length];
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public String[] getDiseases() {
        return diseases;
    }

    public void setDiseases(String diseas) {
        if (currentDiseasCount > 6) {
            System.out.println("The max number of diseas is 6");
            System.exit(5);
        } else {
            this.diseases[currentDiseasCount] = diseas;
            currentDiseasCount++;
        }
    }

    public Doctor[] getStaff() {
        return staff;
    }

    public void setStaff(Doctor doctor) {

            this.staff[currentStaffCount] = doctor;
            currentStaffCount++;

    }

    public void removeStaffMember(String doctorName){
        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getFirstName().equals(doctorName)){
                System.out.println("The object is removed");
               staff[i] = null;
            }

        }
    }

}
