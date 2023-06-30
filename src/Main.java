import view.CalculatorView;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
//        // Das ist nicht best practices:
        // new CalculatorView();

//        // Functional Interface runnable hat nur eine abstrakte Methode.
//        // Fügt unsere Anwendung dem UI Thread hinzu. Die Anwendung wird aufgerufen, sobald alle Events der Eventqueue
//        // abgearbeitet wurden.
        // Hier implementieren wir das Runnable Interface in eine anonyme Klasse:
//        SwingUtilities.invokeLater(new Runnable()
//        {
//            @Override
//            public void run()
//            {
//                new CalculatorView();
//            }
//        });

        // Alternative: wir implementieren runnable als Lambdaausdruck:
        SwingUtilities.invokeLater(() -> new CalculatorView());
    }
}