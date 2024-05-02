import java.util.Scanner;
public class Lesson {
    private String subjectName;//закритий модифікатор змінної
    private int couple;
    private String teacher;
    private String lessonType;

    public void inputLessonInfo() {//метод ввід інфор
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву предмету:");
        subjectName = scanner.nextLine();
        System.out.println("Введіть яка пара:");
        couple = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введіть ім'я викладача:");
        teacher = scanner.nextLine();
        System.out.println("Введіть тип занять:");
        lessonType = scanner.nextLine();
        scanner.close();
    }

    public void displayLessonInfo() {//метод виводить то шо я написала
        System.out.println("Назва предмету: " + subjectName);
        System.out.println("Пара: " + couple);
        System.out.println("Викладач: " + teacher);
        System.out.println("Тип занять: " + lessonType);
    }
}

