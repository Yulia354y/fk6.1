import java.util.Scanner;

public class Student {
    private String name;
    private int course;
    private String specialty;
    private int examGrade;
    private int testGrade;
    private int assignmentGrade;

    public Student() {
        this.name = "";
        this.course = 0;
        this.specialty = "";
        this.examGrade = 0;
        this.testGrade = 0;
        this.assignmentGrade = 0;
    }

    public void setMarks(String name, int course, String specialty, int examGrade, int testGrade, int assignmentGrade) {
        this.name = name;
        this.course = course;
        this.specialty = specialty;
        this.examGrade = examGrade;
        this.testGrade = testGrade;
        this.assignmentGrade = assignmentGrade;
    }

    public void inputStudentInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ім'я студента:");
        name = scanner.next();
        System.out.println("Введіть курс студента:");
        course = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введіть спеціальність студента:");
        specialty = scanner.nextLine();
    }

    public void displayStudentInfo() {//вивід інфо
        System.out.println("Ім'я студента: " + name);
        System.out.println("Курс: " + course);
        System.out.println("Спеціальність: " + specialty);
        System.out.println("Оцінка за екзамен: " + examGrade);
        System.out.println("Оцінка за тести: " + testGrade);
        System.out.println("Оцінка за курсову роботу: " + assignmentGrade);
    }

    public void setExamGrade(int examGrade) {//встановлюють нову інформацію там де я ввожу нову інформацію, гет отримує
        this.examGrade = examGrade;
    }

    public void setTestGrade(int testGrade) {
        this.testGrade = testGrade;
    }

    public void setAssignmentGrade(int assignmentGrade) {
        this.assignmentGrade = assignmentGrade;
    }
}