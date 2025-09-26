import javax.swing.*;
import java.awt.*;

// Atividade 1
/* Crie uma janela (JFrame) com título “Bem-vindo ao Swing” que exiba um JLabel com a frase “Olá,
mundo gráfico!”.s */

public class app1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bem-vindo ao Swing!");
        JLabel label = new JLabel("Olá mundo!");
        GridBagConstraints gbc = new GridBagConstraints();

        frame.setLayout(new GridBagLayout());
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(label);

        frame.setVisible(true);
    }
}