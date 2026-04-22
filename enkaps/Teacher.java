import java.util.ArrayList;

public class Teacher extends Person {
    private ArrayList<String> courses;

    public Teacher(String name, String address) {
        super(name, address);
        courses = new ArrayList<>();
    }

    public boolean addCourse(String course) {
        if (courses.contains(course)) {
            return false;
        }
        courses.add(course);
        return true;
    }

    public String toString() {
        return "Teacher: " + super.toString() + " | Courses: " + courses;
    }
}