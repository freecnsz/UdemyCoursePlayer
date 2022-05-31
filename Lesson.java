public class Lesson {

    private int id;
    private String name;
    private Teacher instructor;
    private double lessonTime;

    public Lesson(int id, String name, Teacher instructor, double lessonTime) {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
        this.lessonTime = lessonTime;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Instructor can change later.
    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public void setLessonTime(double lessonTime) {
        this.lessonTime = lessonTime;
    }

    public String getName() {
        return name;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public double getLessonTime() {
        return lessonTime;
    }
}
