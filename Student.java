import java.util.ArrayList;

public class Student extends Person {

    private ArrayList<Course> takenCourses;

    public Student(int id, String name, String lastName) {
        super(id, name, lastName);
        this.takenCourses = new ArrayList<>();
    }

    public ArrayList<Course> getTakenCourses() {
        return takenCourses;
    }

    public void addCourse(Course course) {

        if (course.isActive())
            getTakenCourses().add(course);
    }
}
