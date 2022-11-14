package Computer;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void PC (String id, ArrayList<RAM> rams, ArrayList<CPU> cpus, ArrayList<Mainboards> mbs) {
        ArrayList<String> lst_id = new ArrayList<>();
        lst_id.add("1");
        lst_id.add("2");
        lst_id.add("3");

        ArrayList<Brand> lst_brand = new ArrayList<>();
        lst_brand.add(new Brand("MSI"));
        lst_brand.add(new Brand("Intel"));

        ArrayList<CPU> lst_cpu = new ArrayList<>();
        lst_cpu.add(new CPU(lst_id.get(0), "Apple M1 Pro", lst_brand.get(0), 30000F));
        lst_cpu.add(new CPU(lst_id.get(0), "Apple M1 Max", lst_brand.get(1), 30000F));
        lst_cpu.add(new CPU(lst_id.get(0), "Apple M1 Ultra", lst_brand.get(2), 30000F));

        ArrayList<Mainboards> lst_mbs = new ArrayList<>();
        lst_mbs.add(new Mainboards(lst_id.get(0), "Intel Core i9", lst_brand.get(0), 30000F));
        lst_mbs.add(new Mainboards(lst_id.get(1), "Ryzen Core i9", lst_brand.get(1), 30000F));
        lst_mbs.add(new Mainboards(lst_id.get(2), "Hoang Core i9", lst_brand.get(2), 30000F));


        ArrayList<RAM> lst_ram = new ArrayList<>();
        lst_ram.add(new RAM(lst_id.get(0), "Intel Core i9 10900k", lst_brand.get(0), 300000f));
        lst_ram.add(new RAM(lst_id.get(1), "AMD Ryzen 9 5900X", lst_brand.get(1), 3000000f));
        lst_ram.add(new RAM(lst_id.get(2), "AMD Ryzen 5 5600X", lst_brand.get(2), 3000000f));

        ArrayList<Computer> lst_pc = new ArrayList<>();
        lst_pc.add(new Computer(lst_brand.get(0), lst_cpu.get(0), lst_mbs.get(0), lst_ram.get(0), 5));
        lst_pc.add(new Computer(lst_brand.get(1), lst_cpu.get(1), lst_mbs.get(1), lst_ram.get(1), 8));
        lst_pc.add(new Computer(lst_brand.get(2), lst_cpu.get(2), lst_mbs.get(2), lst_ram.get(1), 10));

        lst_pc.forEach(computer -> {
            System.out.printf("%s %s %s %d %f\n", computer.getCpu().getName(), computer.getRam().getName(), computer.getMainboards().getName(), computer.getSl(), computer.getPrice());
        });
    };

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        Example exam = new Example("Hello");
////        exam.setString("Hi");
//        String s = "Hello";
//        String s1 = new String();
//        System.out.println(s1.intern());
//        Integer i1 = 129;
//        Integer i2 = 129;
//        System.out.println(i1 == i2); -> false
//        String s = "Hi" + "Hello";
//        System.out.println(s);

//        StringBuilder sbd = new StringBuilder("Hi");
//        sbd.append("Hello");
//        String s = sbd.toString();
//        System.out.println(s);

        //Su dung string
//        String s = "";
//        for (i = 0 -> 2)
//        {
//            s = s + "Hello "; -> se bi tao 3 cai stringBuilder
//        }
//
//        Su dung StringBuilder
//        StringBuilder s = "";
//        for (i = 0 -> 2)
//        {
//            s = s + "Hello "; -> se bi tao 3 cai stringBuilder
//        }
//        string s1 = s.toString()
        ArrayList<RAM> ramList = new ArrayList<>();
        ArrayList<CPU> cpuList = new ArrayList<>();
        ArrayList<Mainboards> mbList = new ArrayList<>();

        System.out.println("Moi ban nhap so luong link kien: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++)
        {
            System.out.println("RAM: ");
            RAM ram = new RAM();
            ram.input();
            ramList.add(ram);

            CPU cpu = new CPU();
            cpu.input();
            cpuList.add(cpu);

            Mainboards mainboards = new Mainboards();
            mainboards.input();
            mbList.add(mainboards);
        }
    }
}