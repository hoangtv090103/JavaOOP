import java.util.Scanner;

//The scores of students
public class Student {
//    final int test;
    private String name;
    private int age;
    private String _class;
    private float math;
    private float physics;
    private float chemisty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getPhysics() {
        return physics;
    }

    public void setPhysics(float physics) {
        this.physics = physics;
    }

    public float getChemisty() {
        return chemisty;
    }

    public void setChemisty(float chemisty) {
        this.chemisty = chemisty;
    }

    public Student() {
//        this.test = 9;
    }

    public void printInfo()
    {
        System.out.println();
    }

    public Student(String name, int age, String _class, float math, float physics, float chemisty) {
//        this(); // = call Student()
        this.name = name;
        this.age = age;
        this._class = _class;
        this.math = math;
        this.physics = physics;
        this.chemisty = chemisty;
//        this.test = 10;
    }

    public void printName()
    {
        System.out.println(this.name);
    }

    public float average()
    {
        this.printName();
        return (math + physics + chemisty) / 3;
    }

    public Student increasePoint()
    {
        this.math += 1;
        return this;
    }

    public void input()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien: ");
        setName(scanner.nextLine());
        System.out.println("Nhap tuoi: ");
        setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhap lop: ");
        set_class(scanner.nextLine());
        System.out.println("Nhap diem toan: ");
        setMath(Float.parseFloat(scanner.nextLine()));
        System.out.println("Nhap diem ly: ");
        setPhysics(Float.parseFloat(scanner.nextLine()));
        System.out.println("Nhap diem hoa: ");
        setChemisty(Float.parseFloat(scanner.nextLine()));

    }

    public void output()
    {
        System.out.println("Ten sinh vien: " + this.getName());
        System.out.println("Tuoi: " + this.getAge());
        System.out.println("Lop: " + this.get_class());
        System.out.println("Diem toan: " + this.getMath());
        System.out.println("Diem ly: " + this.getPhysics());
        System.out.println("Diem hoa: " + this.getChemisty());
    }
}
