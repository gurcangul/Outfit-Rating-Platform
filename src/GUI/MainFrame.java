package GUI;


import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void run() {
		try {
			Frame frame = new Frame();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    public MainFrame() {
        
		setBounds(100, 100, 450, 300);
		setTitle("Outfit Rating Platform");
        setSize(780, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void addNewPanel(JPanel panel){
        getContentPane().removeAll();
        getContentPane().add(panel, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    public void addMenuPanel(JPanel panel){
        getContentPane().add(panel, BorderLayout.SOUTH);
        revalidate();
        repaint();
    }
    public JFrame getFrame() {
        return this;
    }
}
