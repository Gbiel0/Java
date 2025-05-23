import javax.swing.JOptionPane;

public class EvenOdd {
    public static void main(String[] args) {
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um valor:"));

        if(n % 2 == 0)
            JOptionPane.showMessageDialog(null, "O número " + n + " é par.");
        else
            JOptionPane.showMessageDialog(null, "O número " + n + " é ímpar.");
    }
}