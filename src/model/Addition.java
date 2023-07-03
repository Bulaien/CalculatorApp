package model;

// Die konkreten Strategy Klassen implementieren das IArithmetic Interface:
public class Addition implements IArithmeticStrategy
{
    @Override
    public double calculate(double firstNumber, double secondNumber)
    {
        return firstNumber + secondNumber;
    }
}
