import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* Crie uma janela com um JButton. Ao clicar no botão, exiba uma mensagem de alerta
(JOptionPane.showMessageDialog) dizendo “Botão clicado!”. */

public class app2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Botão");
        GridBagConstraints gbc = new GridBagConstraints();

        frame.setLayout(new GridBagLayout());
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        JButton button1 = new JButton("Clique no botão!");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame, "Botão clicado!");
            }
        });

        frame.add(button1, gbc);
        frame.setVisible(true);
    }
}
