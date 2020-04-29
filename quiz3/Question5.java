package quiz3;

public class Question5 {
    public static void main(String[] args) {
        
    }
}

interface Calculator {
    public void add(double input);
    public void subtract(double input);
    public void divide(double input);
    public void multiply(double input);
    public void clear();
}

class BasicCalculator implements Calculator {
    private double result;

    public BasicCalculator() {
        result = 0;
    }

    public double getResult() {
        return result;
    }

    public void add(double input) {
        result += input;
    }

    public void subtract(double input) {
        result -= input;
    }

    public void divide(double input) {
        result /= input;
    }

    public void multiply(double input) {
        result *= input;
    }

    public void clear() {
        result = 0;
    }
}