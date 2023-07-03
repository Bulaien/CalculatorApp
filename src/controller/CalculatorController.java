package controller;

import model.Calculator;
import view.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController
{
    // Kontroller ist die Vermittlungsschicht zwischen View und Model, damit diese unabhängig voneinander sind.
    CalculatorView calculatorView;
    Calculator calculator;

    public CalculatorController(CalculatorView calculatorView, Calculator calculator)
    {
        this.calculatorView = calculatorView;
        this.calculator = calculator;

        this.calculatorView.setButtonClickListener(new ButtonClickListener());
    }


    // Der Controller nimmt die Events der View entgegen. Dazu müssen die Buttons einen ActionListener bekommen. Der
    // Listener befindet sich deshalb im Controller.
    class ButtonClickListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getActionCommand() == "Del")
            {
                calculatorView.clearDisplay();
                return;
            }
              calculatorView.writeToDisplay("Hallo Welt");
        }
    }
}
