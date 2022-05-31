import java.util.ArrayList;

public class Teacher extends Person{

    private ArrayList<Lesson> givenLessons;

    public Teacher(int id, String name, String lastName) {
        super(id, name, lastName);
    }

    //the lessons that given by teacher.
    public void giveLesson(Lesson lesson) {
        this.givenLessons.add(lesson);
    }
}
