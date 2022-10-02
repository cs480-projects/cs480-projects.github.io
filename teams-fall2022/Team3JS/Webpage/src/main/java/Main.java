import org.apache.commons.math3.fraction.Fraction;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(doubleToFraction(2.5));
    }
    public static Fraction doubleToFraction(double x)
    {
        Fraction fraction = new Fraction(x);
        return fraction;
    }
}