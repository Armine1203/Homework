package hw12_Inheritance.Problem1;

import hw12_Inheritance.Problem1.Buildings.Building;
import hw12_Inheritance.Problem1.Buildings.Hospital;
import hw12_Inheritance.Problem1.Buildings.School;
import hw12_Inheritance.Problem1.People.Doctor;
import hw12_Inheritance.Problem1.People.Student;
import hw12_Inheritance.Problem1.People.Teacher;

public class BuildingDemo {
    public static void main(String[] args) {
        Building building = new Building(8,10);
        Student student = new Student("Armine","Lalayan", 21);
        Teacher teacher = new Teacher("Anna", "Beglaryan",30,"Math");
        School school = new School(25,52,student, teacher, 3,3 );
        school.setTeachers(new Teacher("Ani","Abgaryan",25,"Chemistry"));
        System.out.println(school.getCurrentTeacherCount());


        Hospital hospital = new Hospital(2,5,10,2);
        hospital.setDiseases("Hypertension");
        hospital.setDiseases("Asthma");
        hospital.setDiseases("Tuberculosis");
        hospital.setDiseases("Diabetes Mellitus");
        hospital.setDiseases("Influenza");
        hospital.setDiseases("Malaria");
//        hospital.setDiseases("Malaria");
        Doctor doctor = new Doctor("Ani","Arshakyan",30,"Neuropathologist");
        Doctor doctor1 = new Doctor("Ani1","Arshakyan1",31,"Neuropathologist1");
        Doctor doctor2 = new Doctor("Ani2","Arshakyan2",32,"Neuropathologist2");
        hospital.setStaff(doctor);
        hospital.setStaff(doctor1);
        hospital.setStaff(doctor2);
        //hospital.setStaff(doctor2);
        hospital.removeStaffMember("Ani");


    }
}
