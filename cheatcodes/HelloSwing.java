import javax.swing.*;
public class HelloSwing {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Hello Swing");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);
            JLabel label = new JLabel("Welcome to Java Swing!", SwingConstants.CENTER);
            frame.add(label);
            frame.setVisible(true);
        });
    }
}
