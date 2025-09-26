package ClassesPacks;
import java.awt.Color;
import javax.swing.*;

public class Progressbar extends Thread {
    protected JFrame frameProgressBar = new JFrame("Progressbar");
    protected JProgressBar progressBar = new JProgressBar(0, 100);
    public void ProgressbarRun(){

        frameProgressBar.setSize(650, 200);
        frameProgressBar.setLocationRelativeTo(null);
        frameProgressBar.setLayout(null);
        progressBar.setBounds(40, 50, 560, 50);
        progressBar.setStringPainted(true);
        progressBar.setValue(0);
        progressBar.setForeground(new Color(50, 200, 50));

        frameProgressBar.add(progressBar);
        frameProgressBar.setVisible(true);
        new CBL(progressBar, frameProgressBar).start();
    }   
}