import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        Student student1 = new Student();
//        Student student2 = new Student("Hoang", 19, "CS63", 10, 10, 2);
//        System.out.println(student2.increasePoint().average());
//        System.out.println(student1.test + " " + student2.test);
        ArrayList<Student> students = new ArrayList<>();
        System.out.println(("Nhap so sinh vien: "));
        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
        {
            Student student = new Student();
            student.input();
            students.add(student);
        }

        for (int i = 0; i < n; i++) {
            students.get(i).output();
        }
    }
}