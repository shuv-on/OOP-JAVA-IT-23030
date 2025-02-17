OOP Java final lab Test
Q01))
public class Q01 {
    public static void reverse(float[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            float temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        float[] arr = {5.8f, 2.6f, 9.0f, 3.4f, 7.1f};

        System.out.println("Original array:");
        for (float num : arr) {
            System.out.print(num + " ");
        }

        reverse(arr);

        System.out.println("\nReversed array:");
        for (float num : arr) {
            System.out.print(num + " ");
        }
    }
}
Output: 
Original array:
5.8 2.6 9.0 3.4 7.1 
Reversed array:
7.1 3.4 9.0 2.6 5.8 
Q03))
import java.util.Scanner;

class Course {
    int credit;
    int ct;
    int at;
    int fe;
    double gradePoint;

    public Course(int credit, int ct, int at, int fe) {
        this.credit = credit;
        this.ct = ct;
        this.at = at;
        this.fe = fe;
        this.gradePoint = calculateGradePoint();
    }

    private double calculateGradePoint() {
        int totalMarks = ct + at + fe;

        if (totalMarks >= 80) return 4.0;
        else if (totalMarks >= 75) return 3.75;
        else if (totalMarks >= 70) return 3.5;
        else if (totalMarks >= 65) return 3.25;
        else if (totalMarks >= 60) return 3.0;
        else if (totalMarks >= 55) return 2.75;
        else if (totalMarks >= 50) return 2.5;
        else if (totalMarks >= 45) return 2.25;
        else if (totalMarks >= 40) return 2.0;
        else return 0.0;
    }
}

class Student {
    String studentId;
    int totalCredits;
    int earnedCredits;
    double cgpa;

    public Student(String studentId, Course[] courses) {
        this.studentId = studentId;
        this.totalCredits = 0;
        this.earnedCredits = 0;
        double totalGradePoints = 0;

        for (Course course : courses) {
            totalCredits += course.credit;
            if (course.gradePoint > 0.0) earnedCredits += course.credit;
            totalGradePoints += (course.gradePoint * course.credit);
        }

        this.cgpa = (totalCredits > 0) ? totalGradePoints / totalCredits : 0.0;
    }

    public String getGrade() {
        if (cgpa >= 4.0) return "A+";
        else if (cgpa >= 3.75) return "A";
        else if (cgpa >= 3.5) return "A-";
        else if (cgpa >= 3.25) return "B+";
        else if (cgpa >= 3.0) return "B";
        else if (cgpa >= 2.75) return "B-";
        else if (cgpa >= 2.5) return "C+";
        else if (cgpa >= 2.25) return "C";
        else if (cgpa >= 2.0) return "D";
        else return "F";
    }

    public void displayResult() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Credit Taken: " + totalCredits);
        System.out.println("Credit Earned: " + earnedCredits);
        System.out.printf("CGPA: %.2f\n", cgpa);
        System.out.println("Grade: " + getGrade());
    }
}

public class Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String studentId = scanner.next();

        System.out.print("Enter number of courses: ");
        int numCourses = scanner.nextInt();

        Course[] courses = new Course[numCourses];

        for (int i = 0; i < numCourses; i++) {
            System.out.println("Course " + (i + 1) + ":");
            System.out.print("Enter Credit (Max 3): ");
            int credit = scanner.nextInt();
            System.out.print("Enter CT (Max 30): ");
            int ct = scanner.nextInt();
            System.out.print("Enter AT (Max 10): ");
            int at = scanner.nextInt();
            System.out.print("Enter FE (Max 60): ");
            int fe = scanner.nextInt();
            courses[i] = new Course(credit, ct, at, fe);
        }

        Student student = new Student(studentId, courses);
        System.out.println("\nSample Output:");
        student.displayResult();

        scanner.close();
    }
}
Output: 
Enter Student ID: IT23030
Enter number of courses: 3
Course 1:
Enter Credit (Max 3): 3
Enter CT (Max 30): 25
Enter AT (Max 10): 8
Enter FE (Max 60): 55
Course 2:
Enter Credit (Max 3): 3
Enter CT (Max 30): 25
Enter AT (Max 10): 8
Enter FE (Max 60): 55
Course 3:
Enter Credit (Max 3): 3
Enter CT (Max 30): 25
Enter AT (Max 10): 8
Enter FE (Max 60): 55

Sample Output:
Student ID: IT23030
Credit Taken: 9
Credit Earned: 9
CGPA: 4.00
Grade: A+


