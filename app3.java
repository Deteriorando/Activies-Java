import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* Crie uma janela com:
- Um JTextField para digitar o nome;
- Um JButton “Confirmar”;
- Um JLabel que mostra o texto “Olá, [nome digitado]!” após clicar no botão. */

public class app3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Coloque seu nome");
        GridBagConstraints gbc = new GridBagConstraints();

        frame.setLayout(new GridBagLayout());
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JLabel nome = new JLabel("Nome:");
        JTextField InputNome = new JTextField(15);
        JButton Submmit = new JButton("Submmit");

        Submmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String info = InputNome.getText().trim();

                if(info.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Nome vazio!", "Erro!", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                JOptionPane.showMessageDialog(null, "Olá "+ info +" Seja bem vindo!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(nome, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(InputNome, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        frame.add(Submmit, gbc);


        frame.setVisible(true);
    }
}
