package Computer;

import java.util.Scanner;

public class Mainboards {
    private String id;
    private String name;
    Brand brand;
    private float price;
    Scanner sc = new Scanner(System.in);

    public Mainboards() {
    }

    public Mainboards(String id, String name, Brand brand, float price) {
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

    public void input()
    {
        System.out.println("Nhap ma Mainboards: ");
        setId(sc.nextLine());
        System.out.println("Nhap ten Mainboards: ");
        setName(sc.nextLine());
        System.out.println("Nhap thuong hieu Mainboards: ");
        brand.input();
    }

}
