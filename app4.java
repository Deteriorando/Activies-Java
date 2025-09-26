import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* Crie uma janela com três JCheckBox representando hobbies (ex.: “Ler”, “Esportes”, “Música”). Ao
clicar em “Mostrar Seleção”, exiba um JOptionPane listando os hobbies escolhidos. */

public class app4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hobbies!");
        GridBagConstraints gbc = new GridBagConstraints();

        String[] Hobbies = {"Selecionar", "Ler", "Esporte", "Música"};
        JComboBox<String> comboBox = new JComboBox<>(Hobbies);

        JButton Submmit = new JButton("Enviar");

        Submmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                Object info = comboBox.getSelectedItem();
                String infoSelected = info.toString();

                if("Selecionar".equals(infoSelected)){
                    return;
                } 

                JOptionPane.showMessageDialog(null, "Seus Hobbies: " + infoSelected, "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(comboBox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(Submmit, gbc);

        
        frame.setVisible(true);
    }
}
