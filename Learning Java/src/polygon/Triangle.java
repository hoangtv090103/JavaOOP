package polygon;

import java.lang.Math;
import java.util.Scanner;

public class Triangle {
    public static Scanner scanner = new Scanner(System.in);
    public float a, b, c;
    public float perimeter ()
    {
        return a + b + c;
    }

    public Triangle() {
    }

    public void input ()
    {
        a = scanner.nextFloat();
        b = scanner.nextFloat();
    }

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float area ()
    {
        float p = perimeter() / 2;
        return (float) Math.sqrt(p* (p-a) * (p-b) * (p-c));
    }
}
