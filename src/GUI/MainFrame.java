package GUI;


import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
	MenuPanel menuPanel=new MenuPanel(this);
	
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
        setSize(760, 460);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void addNewPanel(JPanel panel){
        getContentPane().removeAll();
        getContentPane().add(panel, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    public void addMenu(){
    	getContentPane().removeAll();
        getContentPane().add(menuPanel, BorderLayout.PAGE_START);
        revalidate();
        repaint();
    }
    public void addMenuPanel(JPanel panel){
    	addMenu();
    	
        getContentPane().add(panel, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    
    public JFrame getFrame() {
        return this;
    }
}
