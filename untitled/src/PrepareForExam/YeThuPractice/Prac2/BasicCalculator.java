package PrepareForExam.YeThuPractice.Prac2;

public class BasicCalculator implements Caculator {
    private double result;

    public BasicCalculator() {
    }


    @Override
    public double getResult() {
        return result;
    }

    @Override
    public void clear() {
        result = 0;

    }

    @Override
    public void add(double input) {
        result += input;

    }

    @Override
    public void substract(double input) {
        result -= input;

    }

    @Override
    public void multiply(double input) {
        result *= input;

    }

    @Override
    public void divide(double input) {
        result /= input;
    }
}
