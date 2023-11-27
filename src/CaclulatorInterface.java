import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaclulatorInterface {
    
    private BufferedReader reader;
    private Calculator calc = new Calculator();
    private final String ADD = "+";
    private final String SUB = "-";
    private final String MUL = "*";
    private final String DIV = "/";
    private final String EXP = "^";

    public CaclulatorInterface() throws CalculatorException {
        reader = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            loop();
            //System.out.println("To quit, type quit");
        }
    }

    private void loop() throws CalculatorException {
        String answer;
        try{
            answer = calculate(getExpression());
        } catch (IOException e) {
            throw new CalculatorException("Unable to read expression");
        }
        
        if(answer=="quit") {
            System.out.println("Thanks for using our calculator!");
            System.exit(0);
        } else {
            System.out.println("Answer: "+answer);
        }
    }
    
    private String calculate(String e) throws CalculatorException {
        //System.out.println("E: "+e);
        if(e.trim().toLowerCase().equals("quit")) {
            //System.out.println("here");
            return "quit";
        } else if(e.contains(ADD)) {
            String[] parts = e.split("\\"+ADD);
            return calc.add(calculate(parts[0]), calculate(parts[1]));
        } else if (e.contains(SUB)) {
            String[] parts = e.split("\\"+SUB);
            return calc.subtract(calculate(parts[0]), calculate(parts[1]));
        } else if (e.contains(MUL)) {
            String[] parts = e.split("\\"+MUL);
            return calc.multiply(calculate(parts[0]), calculate(parts[1]));
        } else if (e.contains(DIV)) {
            String[] parts = e.split("\\"+DIV);
            return calc.divide(calculate(parts[0]), calculate(parts[1]));
        } else if (e.contains(EXP)) {
            String[] parts = e.split("\\"+EXP);
            return calc.exponent(calculate(parts[0]), calculate(parts[1]));
        } else {
            return e;
        }

    }

    private String getExpression() throws IOException {
        System.out.println("Enter your expression: ");
        return reader.readLine().replaceAll("\\s+", "");
    }

    public static void main(String args[]) throws CalculatorException {
        System.out.println("Weclome to the Calculator!");
        System.out.println("Type 'quit' at any time to stop.");
        System.out.println("Otherwise, type your expression.");
        System.out.println("\nAvailable Operators: +, -, *, or /");
        new CaclulatorInterface();
    }

}
