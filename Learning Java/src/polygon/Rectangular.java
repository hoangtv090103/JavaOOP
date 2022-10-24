package polygon;

public class Rectangular {
    public float a, b;
    public float perimeter ()
    {
        return 2 * (a + b);
    }
    public float area()
    {
        return a * b;
    }
}
