import java.util.Scanner;

public class GradeCalculatorUsingSwitchStmt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks (out of 100): ");
        double marks = scanner.nextDouble();

        if (marks >= 0 && marks <= 100) {
            String grade = calculateGrade(marks);
            System.out.println("Your grade is: " + grade);
        } else {
            System.out.println("Invalid marks entered. Marks should be between 0 and 100.");
        }

        scanner.close();
    }

    public static String calculateGrade(double marks) {
        int roundedMarks = (int) Math.round(marks / 10.0);
        String grade;

        switch (roundedMarks) {
            case 10:
            case 9:
                grade = "A+";
                break;
            case 8:
                grade = "A";
                break;
            case 7:
                grade = "B";
                break;
            case 6:
                grade = "C";
                break;
            case 5:
                grade = "D";
                break;
            default:
                grade = "F";
        }

        return grade;
    }
}
