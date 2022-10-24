package student;

import java.util.Scanner;

public class Student {
    public static Scanner sc = new Scanner(System.in);

    String name;
    String lop;
    int age;
    float math, physic, chemistry;

    public Student() {
    }

    public Student(String name, String lop, int year) {
        this.name = name;
        this.lop = lop;
        this.age = year;
    }

    public void input()
    {
        System.out.println("Nhap ten sinh vien: ");
        name = sc.nextLine();
        System.out.println("Nhap lop cua sinh vien: ");
        lop = sc.nextLine();
        System.out.println("Nhap tuoi cua sinh vien: ");
        age = sc.nextInt();
        System.out.println("Nhap diem toan cua sinh vien: ");
        math = sc.nextFloat();
        System.out.println("Nhap diem li cua sinh vien: ");
        physic = sc.nextFloat();
        System.out.println("Nhap diem hoa cua sinh vien: ");
        chemistry = sc.nextFloat();
    }

    public float average()
    {
        return (math + physic + chemistry) / 3;
    }
}
