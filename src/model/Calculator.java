package model;

// Die Kontextklasse:
public class Calculator
{
    private IArithmeticStrategy arithmeticStrategy;

    public void setArithmeticStrategy(IArithmeticStrategy arithmeticStrategy)
    {
        this.arithmeticStrategy = arithmeticStrategy;
    }

    public void calculate(double ersteZahl, double zweiteZahl)
    {
        this.arithmeticStrategy.calculate(ersteZahl, zweiteZahl);
    }
}
