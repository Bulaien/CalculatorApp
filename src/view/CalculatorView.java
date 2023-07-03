package view;

import javax.swing.*;
import java.awt.*;

public class CalculatorView
{
    // Attribute, Instanzvariablen, Felder:
    private JFrame calculatorFrame;
    private JTextField txt_display;
    private JPanel pnl_buttons;

    public CalculatorView()
    {
        this.calculatorFrame = new JFrame();
        this.calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Feste Werte im Quellcode ist ein Code Smell!
        // Hier haben Pixelwerte hardcoded. Solche fest in den quellcode eingetragene Werte werden als Literale
        // bezeichnet. Oder auch einfach Magic Numbers.
        this.calculatorFrame.setSize(420, 550);

//        this.calculatorFrame.setSize(Toolkit.getDefaultToolkit().getScreenSize().width,
//                Toolkit.getDefaultToolkit().getScreenSize().height);

        this.calculatorFrame.setMinimumSize(new Dimension(400, 200));
        this.calculatorFrame.setPreferredSize(new Dimension(400, 200));

        // bad practice. Laut Oracle sollte immer ein Layout Manager verwendet werden:
        // Absolute Layout:
        this.calculatorFrame.setLayout(null);

        // zentriert das Frame:
        this.calculatorFrame.setLocationRelativeTo(null);

        this.calculatorFrame.getContentPane().setBackground(new Color(104, 139, 173));
        this.calculatorFrame.setTitle("CALCUTRON 5000");

        this.calculatorFrame.setVisible(true);
    }
}
