package ThuVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        ArrayList<Sach> books = new ArrayList<>();
        String c = "c";
        int n;
        while (c.equals("c"))
        {
            System.out.print("Nhap ten cuon sach: ");
            Sach book = new Sach();
            TacGia author = new TacGia();
            book.setName(sc.nextLine());
            System.out.print("Nhap ten tac gia: ");
            author.setName(sc.nextLine());
            book.setAuthor(author);
            System.out.print("Nhap so quyen: ");
            n = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < n; i++)
            {
                System.out.print("Nhap trang thai quyen sach thu " + (i + 1) + " [trong kho, trung bay, da cho muon]: ");
                book.setState(sc.nextLine());
                books.add(book);
            }

            System.out.print("De nhap tiep nhan phim c: ");
            c = sc.nextLine();
        }

        for (int i = 0; i < books.size(); i++)
        {
            books.get(i).output();
        }
    }
}
