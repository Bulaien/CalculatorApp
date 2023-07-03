package view;

import javax.swing.*;
import java.awt.*;

public class CalculatorView
{
    // Attribute, Instanzvariablen, Felder:
    private final Font defaultFont = new Font("Arial", Font.BOLD, 30);

    private JFrame calculatorFrame;
    private JTextField txt_display;

    private JButton[] numberButtons;
    private JPanel pnl_buttons;
    private JPanel pnl_display;
    private JPanel pnl_function_buttons;

    public CalculatorView()
    {
        this.createDisplay();
        this.createButtonPanel();
        this.createCalculatorFrame();

    }

    private void createCalculatorFrame()
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
        // Absolute Layout - die Komponenten werden nicht relativ ausgerichtet, sondern mit absoluten Werten:
        this.calculatorFrame.setLayout(null);

        // zentriert das Frame:
        this.calculatorFrame.setLocationRelativeTo(null);

        this.calculatorFrame.getContentPane().setBackground(new Color(104, 139, 173));
        this.calculatorFrame.setTitle("CALCUTRON 9001");
        // this.calculatorFrame.setLayout(new BoxLayout(this.calculatorFrame, BoxLayout.Y_AXIS));

        this.calculatorFrame.add(this.pnl_buttons);
        this.calculatorFrame.add(this.txt_display);

        this.calculatorFrame.setVisible(true);
    }

    private void createDisplay()
    {
        this.txt_display = new JTextField();
        this.txt_display.setBounds(50, 25, 300, 50);
        this.txt_display.setFont(new Font("Arial", Font.BOLD, 30));
        this.txt_display.setHorizontalAlignment(JTextField.RIGHT);
        this.txt_display.setEditable(false);
        // this.txt_display.setText("Hallo Welt!");

//        this.pnl_display = new JPanel();
//        this.pnl_display.setBackground(Color.ORANGE);

//        this.pnl_display.add(txt_display);
//        this.pnl_display.setVisible(true);
    }

    private void createButtonPanel()
    {
        this.numberButtons = new JButton[10];

        for(int i = 0; i < 10; i++)
        {
            this.numberButtons[i] = new JButton(String.format(String.valueOf(i)));
            this.numberButtons[i].setFont(defaultFont);
            this.numberButtons[i].setFocusable(false);
        }

        // TODO: Das refaktorisieren und am besten in der Schleife zuordnen.
        this.pnl_buttons = new JPanel();
        this.pnl_buttons.add(numberButtons[7]);
        this.pnl_buttons.add(numberButtons[8]);
        this.pnl_buttons.add(numberButtons[9]);

        this.pnl_buttons.add(numberButtons[4]);
        this.pnl_buttons.add(numberButtons[5]);
        this.pnl_buttons.add(numberButtons[6]);

        this.pnl_buttons.add(numberButtons[1]);
        this.pnl_buttons.add(numberButtons[2]);
        this.pnl_buttons.add(numberButtons[3]);

        this.pnl_buttons.add(numberButtons[0]);

        // HIer wird das Panel erstellt:
        this.pnl_buttons.setBounds(50, 100, 300, 300);
        this.pnl_buttons.setBackground(new Color(87, 118, 148));
        this.pnl_buttons.setLayout(new GridLayout(4, 4, 10, 10));
    }
}


