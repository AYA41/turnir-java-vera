import java.math.BigInteger;
import java.util.Optional;

public class Calculator {

    private double x;
    private double a;
    private double b;

    public Calculator(double x) {
        this.x = x;
    }

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Calculator(double x, double a, double b) {
        this.x = x;
        this.a = a;
        this.b = b;
    }

    public String linear() {
        double result = 3*x+5;
        return "y = " + result;
    }

    public String fractional() {
        if (a-b == 0) {
            return "a-b не может быть равно 0!";
        } else {
            double result = (a+b)/(a-b);
            return "y = " + result;
        }
    }

    public String factorial() {
        if (b == 0) {
            return "b не может быть равно 0!";
        } else {
            double fraction = (a*x)/b;
            int value = (int) fraction;
            return "y = " + getFactorial(value);
        }
    }

    private BigInteger getFactorial(int value) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= value; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }


}
