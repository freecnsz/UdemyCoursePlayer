import java.util.ArrayList;

public class Teacher extends Student{

    private ArrayList<Course> givenCourses;

    public Teacher(int id, String name, String lastName) {
        super(id, name, lastName);
        this.givenCourses = new ArrayList<>();
    }

    //The lessons that given by teacher.
    public void giveLesson(Course course) {
        this.givenCourses.add(course);
    }
}
