import java.util.ArrayList;

public class Course {

    private int id;
    private String name;
    private ArrayList<Lesson> lessons;
    private double totalTime;
    private boolean isActive;

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
        this.totalTime = 0;
        this.isActive = false;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
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
}
