import java.awt.*;
import javax.swing.*;

public class app5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        GridBagConstraints gbc = new GridBagConstraints();

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        JButton submmit = new JButton("Enviar");

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        // frame.add(, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        // frame.add(, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        frame.add(submmit, gbc);

        frame.setVisible(true);
    }
}
