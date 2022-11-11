package ThuVien;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Sach {
    private String name;
    private String state;
    private TacGia author;

    public Sach(String name, String state) {
        this.name = name;
        this.state = state;
    }

    public Sach() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public TacGia getAuthor() {
        return author;
    }

    public void setAuthor(TacGia author) {
        this.author = author;
    }

    public void output()
    {
        System.out.println("Ten Sach: " + this.name);
        System.out.println("Tac gia: " + this.author.getName());
        System.out.println("Trang thai: " + this.state);
    }
}

