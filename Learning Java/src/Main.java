import polygon.*;
import student.Student;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public Main() {
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.input();
        System.out.println(st.average());

    }

}