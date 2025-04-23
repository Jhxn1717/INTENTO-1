
import javax.swing.JOptionPane;

public class Multiplicacion {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));// Primer número
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));// Segundo número

        int resultado = numero1 * numero2;

        JOptionPane.showMessageDialog(null,"El resultado de la multiplicación es: " + resultado);
    }
}
