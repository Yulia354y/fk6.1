import java.util.Scanner;

public class Marks {
    private int examGrade;
    private int testGrade;
    private int assignmentGrade;

    public Marks() {
        this.examGrade = 0;
        this.testGrade = 0;
        this.assignmentGrade = 0;
    }

    public Marks(int examGrade, int testGrade, int assignmentGrade) {//конструктор для модифікації змінної
        this.examGrade = examGrade;
        this.testGrade = testGrade;
        this.assignmentGrade = assignmentGrade;
    }

    public void inputMarks() {//метод на ввід інфор
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть оцінку за екзамен:");
        examGrade = scanner.nextInt();
        System.out.println("Введіть оцінку за тести:");
        testGrade = scanner.nextInt();
        System.out.println("Введіть оцінку за курсову роботу:");
        assignmentGrade = scanner.nextInt();
        scanner.close();
    }

    public double calculateAverageGrade() {
        return (examGrade + testGrade + assignmentGrade) / 3.0;
    }

    public void displayMarks() {//вивід інфор
        System.out.println("Оцінка за екзамен: " + examGrade);
        System.out.println("Оцінка за тести: " + testGrade);
        System.out.println("Оцінка за курсову роботу: " + assignmentGrade);
        double averageGrade = calculateAverageGrade(); // Отримати середню оцінку
        System.out.println("Середня оцінка: " + averageGrade);

        if (averageGrade < 3) {
            System.out.println("Старайтесь краще. Вас скоро виженуть!");
        } else if (averageGrade >= 3 && averageGrade < 4) {
            System.out.println("Старайтесь краще");
        } else if (averageGrade >= 4 && averageGrade <= 5) {
            System.out.println("Ви молодець!");
        } else {
            System.out.println("Невідомий.");
        }
    }
}