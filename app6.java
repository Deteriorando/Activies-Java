import ClassesPacks.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class app6 {
    @SuppressWarnings("Convert2Lambda")
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        GridBagConstraints gbc = new GridBagConstraints();

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        JLabel labelName = new JLabel("Nome: ");
        JLabel labelPassword = new JLabel("Password: ");

        JTextField inputName = new JTextField(15);
        JPasswordField inputPassword = new JPasswordField(15);

        JButton submmit = new JButton("Enviar");

        Users[] users = {
            new Users("Deteriorando", "dete123"),
            new Users("Admin", "123"), 
            new Users("Floquinho", "floquinho1")
        };
        

        submmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String name = inputName.getText().trim();
                String password = new String(inputPassword.getPassword());
                String info = "Ola " + name;
                boolean founded = false;

                if(name.isEmpty() || password.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Preencha as informações!", "Erro!", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // verificar se as informações do usuário(No caso objeto) existem com array.
                for (Users userFounded : users) {
                    if(userFounded.getName().equals(name) && userFounded.getPassword().equals(password)){
                        founded = true;
                        break;
                    }
                }

                if(!founded){
                    JOptionPane.showMessageDialog(null, "Erro no nome ou na senha!", "Erro!", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                JOptionPane.showMessageDialog(null, info + "\nLogin efetuado com sucesso", "Sucess", JOptionPane.INFORMATION_MESSAGE);

                frame.dispose(); //Parar o programa
            }
        });

        /* -------------------------------- */

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(labelName, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(inputName, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        frame.add(labelPassword, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        frame.add(inputPassword, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        frame.add(submmit, gbc);

        frame.setVisible(true);

    }
}
