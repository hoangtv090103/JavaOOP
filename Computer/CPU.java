package Computer;
import java.util.Scanner;

public class CPU {
    private String id;
    private String name;
    private Brand brand;
    private float price;

    Scanner sc = new Scanner(System.in);

    public CPU() {
    }

    public CPU(String id, String name, Brand brand, float price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    public void input()
    {
        System.out.println("Nhap ma RAM: ");
        setId(sc.nextLine());
        System.out.println("Nhap ten RAM: ");
        setName(sc.nextLine());
        System.out.println("Nhap thuong hieu RAM: ");
        brand.input();
    }

}
