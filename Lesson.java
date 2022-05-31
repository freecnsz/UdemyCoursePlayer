public class Lesson {

    private int id;
    private String name;
    private double lessonTime;

    public Lesson(int id, String name, double lessonTime) {
        this.id = id;
        this.name = name;
        this.lessonTime = lessonTime;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLessonTime(double lessonTime) {
        this.lessonTime = lessonTime;
    }

    public String getName() {
        return name;
    }

    public double getLessonTime() {
        return lessonTime;
    }
}
