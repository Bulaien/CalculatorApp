package view;

public enum Operators
{
    ADDITION("+"),
    SUBTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION("/"),
    SEPERATOR("."),
    EQUALS("="),
    DELETE("Del"),
    CLEAR("Clr");

    // Enumattribut:
    private String btnText;

    private Operators(String btnText)
    {
        this.btnText = btnText;
    }

    public String getBtnText()
    {
        return this.btnText;
    }
}
