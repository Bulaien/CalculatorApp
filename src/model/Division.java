package model;

import javax.swing.*;

public class Division implements IArithmeticStrategy
{
    @Override
    public double calculate(double firstNumber, double secondNumber)
    {
        if(secondNumber == 0)
        {
           // TODO: Das muss aus dem Model raus. // Mache ne exception und reiche diese durch zur View:
            JOptionPane.showMessageDialog(null, "Teilen durch 0 ist nicht definiert!", "FEHLER", JOptionPane.ERROR_MESSAGE);
        }

        return firstNumber/secondNumber;
    }
}
