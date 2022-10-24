package polygon;

public class Parallelogram {
    public float a, b, h;

    public float perimeter ()
    {
        return 2 * (a + b);
    }

    public float area()
    {
        return a * b;
    }
}
