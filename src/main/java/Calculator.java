import java.lang.*;
import java.util.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Calculator {

    private int solution;
    private int x;
    private int y;
    private char operators;

    public Calculator()
    {
        solution = 0;
        Scanner operators = new Scanner(System.in);
        Scanner operands = new Scanner(System.in);
    }

    public long add(long first, long second) {
        logger.info("Executing addition");
        return first + second;
    }

    public long subtract(long first, long second) {
        return first - second;
    }

    public long multiply(long first, long second) {
        return first * second;
    }

    public long divide(long first, long second) {
        return first / second;
    }

    public void calc(int ops){
        x = 5;
        System.out.println("operand 2: ");
        y = 5;

        switch(ops)
        {
            case(1):
                System.out.println(add(x, y));

                //    operands.next();
                break;
            case(2):
                System.out.println(subtract(x, y));
                // operands.next();
                break;
            case(3):
                System.out.println(multiply(x, y));
                //  operands.next();
                break;
            case(4):
                System.out.println(divide(x, y));
                //  operands.next();
                break;
        }
    }
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public static void main (String[] args)
    {
        System.out.println("What operation? ('+', '-', '*', '/')");
        System.out.println(" Enter 1 for Addition");
        System.out.println(" Enter 2 for Subtraction");
        System.out.println(" Enter 3 for Multiplication");
        System.out.println(" Enter 4 for Division");

        Calculator calc = new Calculator();
        calc.calc(1);
    }
}
