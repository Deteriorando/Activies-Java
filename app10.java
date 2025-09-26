import ClassesPacks.Progressbar;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class app10 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Progress Bar");
        GridBagConstraints gbc = new GridBagConstraints();
        Progressbar progressbar = new Progressbar();

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        JButton InitProgress = new JButton("Next");

        InitProgress.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                progressbar.ProgressbarRun();
            }
        });

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;

        gbc.gridheight = 1;
        gbc.gridwidth = 1;

        gbc.weightx = 1;
        gbc.weighty = 1;
        frame.add(InitProgress, gbc);

        frame.setVisible(true);
    }
}
