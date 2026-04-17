package hust.soict.hedspi.lab01.Lab01.src;

import javax.swing.JOptionPane;

public class CalculateNumbers {
    public static void main(String[] args) {
        String strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number: ", "Input first number",
                JOptionPane.INFORMATION_MESSAGE);
        String strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number: ", "Input second number",
                JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        String quotientResult;
        if (num2 != 0) {
            quotientResult = String.valueOf(num1 / num2);
        } else {
            quotientResult = "Cannot divide by zero!";
        }
        String message = "First number: " + num1 + "\n" +
                "Second number: " + num2 + "\n" +
                "Sum: " + sum + "\n" +
                "Difference: " + difference + "\n" +
                "Product: " + product + "\n" +
                "Quotient: " + quotientResult;
        JOptionPane.showMessageDialog(null, message, "Calculation Results", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}