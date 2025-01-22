package hw19_ArrayList;


import java.util.ArrayList;

public class StudentGrades implements Comparable<StudentGrades> {
    private String studentName;
    private int mathKnowledge;
    private int physicsKnowledge;
    private int historyKnowledge;

    StudentGrades(String name, int mathKnowledge, int physicsKnowledge, int historyKnowledge) {
        this.studentName = name;
        this.mathKnowledge = mathKnowledge;
        this.physicsKnowledge = physicsKnowledge;
        this.historyKnowledge = historyKnowledge;
    }

    public int getMathKnowledge() {
        return mathKnowledge;
    }

    public int getPhysicsKnowledge() {
        return physicsKnowledge;
    }

    public int getHistoryKnowledge() {
        return historyKnowledge;
    }

    public String getStudentName() {
        return studentName;
    }

    public int totalKnowledge() {
        return getMathKnowledge() + getHistoryKnowledge() + getPhysicsKnowledge();
    }


    public static int compareStudentGrades(StudentGrades studentGrades1,StudentGrades studentGrades2) {
        return studentGrades1.compareTo(studentGrades2);
    }

    @Override
    public int compareTo(StudentGrades o) {
        return 0;
    }

    @Override
    public String toString() {
        return "{" + studentName + ": " +
                mathKnowledge +
                ','+ physicsKnowledge +
                ','+ historyKnowledge +
                '}';
    }
}
