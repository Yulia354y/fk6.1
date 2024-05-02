import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть 1 для введення інформації в розклад, 2 для розрахунку середньої оцінки , 3 для введення інформації про студента:");
        int choice = scanner.nextInt();
        scanner.nextLine();

        Lesson lesson = new Lesson();
        Marks marks = new Marks();
        Student student= new Student();;

        switch (choice) {
            case 1:
                lesson.inputLessonInfo();
                lesson.displayLessonInfo();
                break;
            case 2:
                marks.inputMarks();
                marks.displayMarks();
                break;
            case 3:
                student.inputStudentInfo();

                Marks studentMarks = new Marks(3, 5, 4);
                student.displayStudentInfo();
                break;
            default:
                System.out.println("Невірний вибір!");
        }
        scanner.close();
    }
}