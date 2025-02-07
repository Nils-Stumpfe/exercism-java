class CalculatorConundrum {

    public String calculate(int operand1, int operand2, String operation) {
        
        switch (operation) {
            case null : throw new IllegalArgumentException("Operation cannot be null");
            case "" : throw new IllegalArgumentException("Operation cannot be empty");
            case "+" : return operand1 + " + " + operand2 + " = " + (operand1 + operand2);
            case "*" : return operand1 + " * " + operand2 + " = " + (operand1 * operand2);
            case "/" : 
                try {
                return operand1 + " / " + operand2 + " = " + (operand1 / operand2);
                } catch (ArithmeticException ae) {
                    throw new IllegalOperationException("Division by zero is not allowed", ae);
                }
            default : throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
    }

}
