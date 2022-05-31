import java.util.ArrayList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        Teacher t1 = new Teacher(1, "Emre", "Altunbilek");
        Teacher t2 = new Teacher(2, "Mehmet", "Cenkci");

        Lesson l1 = new Lesson(101, "Entering to Java", 25.54);
        Lesson l2 = new Lesson(102, "What is Programming", 19.5);
        Lesson l3 = new Lesson(103, "Programming Languages", 35.4);
        Lesson l4 = new Lesson(104, "Data Base", 50.3);

        Course c1 = new Course(01, "Learning Java", t1);

        c1.addInstructor(t1);
        c1.addInstructor(t2);

        c1.addLesson(l1);
        c1.addLesson(l2);
        c1.addLesson(l3);
        c1.addLesson(l4);

        Student s1 = new Student(1, "Özgür", "Cansız");

        s1.addCourse(c1);
    }

    public static void showMenu() {

        System.out.println("===============================================================");


    }

    public static void playList(ArrayList<Lesson> lessons) {

        ListIterator iterator = lessons.listIterator();

        while (iterator.hasNext()) {

        }
    }
}
