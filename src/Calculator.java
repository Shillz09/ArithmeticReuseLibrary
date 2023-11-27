import static java.lang.Double.parseDouble;
import StringUtils.MathFunctions;

public class Calculator {

    public String add(String x, String y) throws CalculatorException {
        test(x,y);
        return MathFunctions.addDoubles(x, y);
    }

    public String subtract(String x, String y) throws CalculatorException {
        test(x,y);
        return MathFunctions.subDoubles(x, y);
    }

    public String multiply(String x, String y) throws CalculatorException {
        test(x,y);
        return MathFunctions.mulDoubles(x, y);
    }

    public String divide(String x, String y) throws CalculatorException {
        test(x,y);
        return MathFunctions.divDoubles(x, y);
    }

    public String exponent(String x, String y) throws CalculatorException {
        test(x,y);
        if(y.equals("0")){
            return "1";
        } else if (y.equals("1")){
            return x;
        }

        String a = x;
        for(double i=1; i<parseDouble(y); i++) {
            a = multiply(a, x);
        }
        return a;
    }

    private void test(String a, String b) throws CalculatorException {
        try {
            parseDouble(a);
        } catch (NumberFormatException e) {
            throw new CalculatorException("String "+a+" cannot be parsed as a Double");
        }

        try {
            parseDouble(b);
        } catch (NumberFormatException e) {
            throw new CalculatorException("String "+b+" cannot be parsed as a Double");
        }
    }

/*     public static void main(String[] args) throws CalculatorException {
        System.out.println("Running...");
        //Calculator calc = new Calculator();
        System.out.println("2 + 3 = " + Calculator.add("2", "3"));
        System.out.println("3 - 2 = " + Calculator.subtract("3", "2"));
        System.out.println("2 * 3 = " + Calculator.multiply("2", "3"));
        System.out.println("22 / 7 = " + Calculator.divide("22", "7"));
        System.out.println("25 / 8 = " + Calculator.divide("25", "8"));
    } */
}
