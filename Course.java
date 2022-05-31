import java.util.ArrayList;

public class Course {

    private int id;
    private String name;
    private ArrayList<Lesson> lessons;
    private static double totalTime = 0;

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
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

    public void addLesson(Lesson lesson) {
        this.lessons.add(lesson);
        totalTime += lesson.getLessonTime();
    }
}
