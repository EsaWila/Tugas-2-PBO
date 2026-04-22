import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<String> courses;
    private ArrayList<Integer> grades;

    public Student(String name, String address) {
        super(name, address);
        courses = new ArrayList<>();
        grades = new ArrayList<>();
    }

    public void addCourseGrade(String course, int grade) {
        courses.add(course);
        grades.add(grade);
    }

    public void printGrades() {
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i) + ": " + grades.get(i));
        }
    }

    public double getAverageGrade() {
        int sum = 0;
        for (int g : grades) {
            sum += g;
        }
        return grades.size() == 0 ? 0 : (double) sum / grades.size();
    }

    public String toString() {
        return "Student: " + super.toString();
    }
}