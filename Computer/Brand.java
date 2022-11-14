package Computer;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Brand {
    private String name;
    Scanner sc = new Scanner(System.in);

    public Brand() {
    }

    public Brand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void input() {
        System.out.println("Nhap ma thuong hieu: ");
        setName(sc.nextLine());
    }
}

