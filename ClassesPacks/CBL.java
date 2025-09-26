package ClassesPacks;
import javax.swing.*;

public class CBL extends Thread{
    protected JProgressBar progressBar = new JProgressBar();
    protected JFrame frameProgressBar = new JFrame();

    public CBL(JProgressBar progressbar, JFrame frameProgressbar){
        this.progressBar = progressbar;
        this.frameProgressBar = frameProgressbar;
    }

    @Override
    public void run(){
        while(progressBar.getValue()<100){
            try {
                sleep(10);
                SwingUtilities.invokeLater(() -> progressBar.setValue(progressBar.getValue()+1));

            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        JOptionPane.showMessageDialog(null, "Carregamento concluido", "Carregado!", JOptionPane.INFORMATION_MESSAGE);
        SwingUtilities.invokeLater(() -> frameProgressBar.dispose());
    }
}
