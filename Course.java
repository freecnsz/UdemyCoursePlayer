import java.util.ArrayList;

public class Course {

    private int id;
    private String name;
    private ArrayList<Teacher> instructors;
    private ArrayList<Lesson> lessons;
    private ArrayList<Student> students;
    private double totalTime;

    // to be true the course has to have at least 60 min. lessons
    private boolean isActive;


    public Course(int id, String name, Teacher headInstructor) {
        this.id = id;
        this.name = name;
        this.instructors = new ArrayList<>();
        this.lessons = new ArrayList<>();
        this.students = new ArrayList<>();
        this.instructors.add(headInstructor);
        this.totalTime = 0;
        this.isActive = false;
    }

    public ArrayList<Teacher> getInstructors() {
        return instructors;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public boolean isActive() {
        return isActive;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Lesson> getLessons() {
        return lessons;
    }

    /*
    The lessons that the course contains.
    The totalTime will be updated and checked in every add operations to
    update isActive situation.
    */
    public void addLesson(Lesson lesson) {
        this.lessons.add(lesson);
        totalTime += lesson.getLessonTime();

        if (totalTime >= 60 && this.lessons.size() >= 5)
            setActive(true);
    }


    // To add instructor to the course.
    public void addInstructor(Teacher teacher) {
        this.instructors.add(teacher);
    }

    public void removeInstructor(Teacher teacher) {
        this.instructors.remove(teacher);
    }
}
