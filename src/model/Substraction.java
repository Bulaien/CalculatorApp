package model;

public class Substraction implements IArithmeticStrategy
{
    @Override
    public double calculate(double firstNumber, double secondNumber)
    {
        return firstNumber - secondNumber;
    }
}
