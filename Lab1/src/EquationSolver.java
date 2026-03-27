import javax.swing.JOptionPane;
public class EquationSolver {
    public static void main(String[] args) {
        String menu = "CHOOSE TYPE OF EQUATION:\n" +
                "1. Linear equation (ax + b = 0)\n" +
                "2. Linear system (2 variables)\n" +
                "3. Quadratic equation (ax^2 + bx + c = 0)\n" +
                "Enter your choice (1-3):";
        String choice = JOptionPane.showInputDialog(null, menu);
        switch (choice) {
            case "1":
                solveLinear();
                break;
            case "2":
                solveSystem();
                break;
            case "3":
                solveQuadratic();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid choice!");
        }
        System.exit(0);
    }
    private static void solveLinear() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter b:"));

        if (a == 0) {
            if (b == 0) JOptionPane.showMessageDialog(null, "Infinitely many solutions.");
            else JOptionPane.showMessageDialog(null, "No solution.");
        } else {
            JOptionPane.showMessageDialog(null, "Solution x = " + (-b / a));
        }
    }
    private static void solveSystem() {
        double a11 = Double.parseDouble(JOptionPane.showInputDialog("Enter a11:"));
        double a12 = Double.parseDouble(JOptionPane.showInputDialog("Enter a12:"));
        double b1  = Double.parseDouble(JOptionPane.showInputDialog("Enter b1:"));
        double a21 = Double.parseDouble(JOptionPane.showInputDialog("Enter a21:"));
        double a22 = Double.parseDouble(JOptionPane.showInputDialog("Enter a22:"));
        double b2  = Double.parseDouble(JOptionPane.showInputDialog("Enter b2:"));

        double D  = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            JOptionPane.showMessageDialog(null, "x1 = " + (D1 / D) + ", x2 = " + (D2 / D));
        } else {
            if (D1 == 0 && D2 == 0) JOptionPane.showMessageDialog(null, "Infinitely many solutions.");
            else JOptionPane.showMessageDialog(null, "No solution.");
        }
    }
    private static void solveQuadratic() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Enter c:"));

        if (a == 0) {
            if (b == 0) {
                if (c == 0) JOptionPane.showMessageDialog(null, "Infinitely many solutions.");
                else JOptionPane.showMessageDialog(null, "No solution.");
            } else {
                JOptionPane.showMessageDialog(null, "x = " + (-c / b));
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                JOptionPane.showMessageDialog(null, "Two roots: x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                JOptionPane.showMessageDialog(null, "Double root: x = " + (-b / (2 * a)));
            } else {
                JOptionPane.showMessageDialog(null, "No real root.");
            }
        }
    }
}