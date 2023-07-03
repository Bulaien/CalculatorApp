package model;

public class Multiplication implements IArithmeticStrategy
{
    @Override
    public double calculate(double firstNumber, double secondNumber)
    {
        return firstNumber * secondNumber;
    }
}
