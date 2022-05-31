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
