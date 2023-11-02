package ru.mirea.lab20;

import javax.swing.*;

public class CalcController extends JFrame {
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
    public static boolean isDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }

    public static String buttonMethod(CalcModel model, String buttonText, String labelText) {
        String result = "";
        if (buttonText.compareTo("C") == 0)
            result = "";
        else if (buttonText.compareTo("SPC") == 0)
            result = labelText + " ";
        else if (buttonText.compareTo("DEL") == 0)
            result = deleteLastSymbol(labelText);
        else if (buttonText.compareTo("=") == 0) {
            result = calculation(model, labelText.split(" "));
        }
        else
            result = labelText + buttonText;
        return result;
    }
    public static String calculation(CalcModel model, String[] items) {
        model.clearStack();
        String result = "";
        for (String item : items) {
            if (item.compareTo("end") == 0)
                break;
            else if (isInteger(item)) {
                model.eventTick(Integer.parseInt(item));
            } else if (isDouble(item)) {
                model.eventTick(Double.parseDouble(item));
            } else {
                try {
                    model.eventTick(item.charAt(0));
                } catch (RuntimeException ignored) {
                }
            }
        }
        return model.toString();
    }
    public static String deleteLastSymbol(String s) {
        String ns = "";
        for (int i = 0; i < s.length() - 1; i++) {
            ns += s.charAt(i);
        }
        return ns;
    }

    public static void main(String[] args) {
        CalcModel calculatorModel = new CalcModel();
        CalcView.createGUI(calculatorModel);
    }
}
