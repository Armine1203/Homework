package hw12_Inheritance.Problem1.Buildings;

import hw12_Inheritance.Problem1.People.Student;
import hw12_Inheritance.Problem1.People.Teacher;

public class School extends Building{
    private Student[] students;
    private Teacher[] teachers ;
    private int studentsMaxNumber;
    private int currentStudentCount = 0;
    private int currentTeacherCount = 0;

    public School(){}
//    public School(int drainageSystem, int voltage, Student student, Teacher teacher, int studentsMaxNumber) {
//        super(drainageSystem, voltage);
//        this.setStudents(student); ;
//        this.setTeachers(teacher);
//        this.setStudentsMaxNumber(studentsMaxNumber);
//
//    }
   public School(int drainageSystem, int voltage, Student student, Teacher teacher, int studentsMaxNumber, int teachersMaxNumber) {
        super(drainageSystem, voltage);
        this.setStudentsMaxNumber(studentsMaxNumber);
        this.setStudentsLength(getStudentsMaxNumber());
        this.setTeachersLength(teachersMaxNumber);
        this.setStudents(student);
        this.setTeachers(teacher);


    }


        public  void setStudentsLength(int length){
            students = new Student[length];
        }
        public  void setTeachersLength(int length){
         teachers = new Teacher[length];
    }
        public Student[] getStudents() {
        return students;
    }


    public void setStudents(Student student) {
        if (getStudentsMaxNumber() < currentStudentCount ){
            System.out.println("The max number of students is full");
            System.exit(5);
        }else {
            this.students[currentStudentCount] = student;
            currentStudentCount++;
        }

    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher teacher) {
        if (getStudentsMaxNumber() < currentTeacherCount ){
            System.out.println("The max number of students is full");
            System.exit(5);
        }else {
            this.teachers[currentTeacherCount] = teacher;
            currentTeacherCount++;
        }
    }

    public int getStudentsMaxNumber() {
        return studentsMaxNumber;
    }
    private void setStudentsMaxNumber(int studentsMaxNumber) {
        this.studentsMaxNumber = studentsMaxNumber;
    }

    public int getCurrentStudentCount() {
        return currentStudentCount;
    }

    public int getCurrentTeacherCount() {
        return currentTeacherCount;
    }
}
