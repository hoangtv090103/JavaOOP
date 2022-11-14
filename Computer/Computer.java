package Computer;

import java.util.Scanner;

public class Computer {
    private Brand brand;
    private CPU cpu;
    private Mainboards mainboards;
    private RAM ram;
    private String name;
    private ID id;
    private int sl;
    private float price;
    Scanner sc = new Scanner(System.in);



    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public Computer(Brand brand, CPU cpu, Mainboards mainboards, RAM ram, int sl) {
        this.brand = brand;
        this.cpu = cpu;
        this.mainboards = mainboards;
        this.ram = ram;
        this.sl = sl;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = cpu.getPrice() + mainboards.getPrice() + ram.getPrice();
    }

    public Computer() {
    }

    public Brand getBrand() {
        return brand;
    }

    public CPU getCpu() {
        return cpu;
    }

    public Mainboards getMainboards() {
        return mainboards;
    }

    public void setMainboards(Mainboards mainboards) {
        this.mainboards = mainboards;
    }

    public RAM getRam() {
        return ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void input()
    {
        System.out.println("Moi ban nhap ten may tinh: ");
        setName(sc.nextLine());
        brand.input();
    }
}
