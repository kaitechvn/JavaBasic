package lambda;

public class LambdaExample {
    public static void main(String[] args) {

        // Using a lambda expression to define the operation
        MathOperation addition = (a, b) -> a + b;

        // Using the lambda expression to perform the operation
        int result = addition.operate(5, 3);

        System.out.println("Result of addition: " + result);

        // Another example with subtraction
        MathOperation subtraction = (a, b) -> a - b;
        System.out.println("Result of subtraction: " + subtraction.operate(5, 3));

        // Multiplication example
        MathOperation multiplication = (a, b) -> a * b;
        System.out.println("Result of multiplication: " + multiplication.operate(5, 3));

        // Division example
        MathOperation division = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return a / b;
        };
        System.out.println("Result of division: " + division.operate(6, 3));
    }
}
