class CalculatorConundrum {

    public String calculate(int operand1, int operand2, String operation) {
        
        int result =
            switch (operation) {
                case "+" -> operand1 + operand2;
                case "*" -> operand1 * operand2;
                case "/" -> divide(operand1, operand2);

                case "" -> throw new IllegalArgumentException("Operation cannot be empty");
                case null -> throw new IllegalArgumentException("Operation cannot be null");
                default -> throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            };

        return String.format("%s %s %s = %s", operand1, operation, operand2, result);
    }

    // inspired by florian-zeidler and sharmaashish54
    //https://exercism.org/tracks/java/exercises/calculator-conundrum/solutions/florian-zeidler
    //https://exercism.org/tracks/java/exercises/calculator-conundrum/solutions/sharmaashish54

    private int divide(int operand1, int operand2) {
        try {
            return operand1 / operand2;
        } catch (ArithmeticException ae) {
            throw new IllegalOperationException("Division by zero is not allowed", ae);
        }
    }

}
