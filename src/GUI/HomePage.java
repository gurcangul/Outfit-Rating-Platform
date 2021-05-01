package GUI;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ImageIcon;

public class HomePage extends JPanel {

	  private MainFrame mainFrame;

	  
	public HomePage(MainFrame mainFrame) {
		JPanel jP=  new JPanel(new GridLayout(3, 1));
        setLayout(null);
        
        JButton btnNewButton = new JButton("Create Collection");
        btnNewButton.setBounds(27, 63, 202, 21);
        add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("See All Collections");
        btnNewButton_1.setBounds(239, 63, 207, 21);
        add(btnNewButton_1);
        
        JButton btnNewButton_1_1 = new JButton("My Profile");
        btnNewButton_1_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton_1_1.setBounds(456, 63, 195, 21);
        add(btnNewButton_1_1);
        
        JButton btnNewButton_1_2 = new JButton("Trends");
        btnNewButton_1_2.setIcon(new ImageIcon("C:\\Users\\Gurcan\\eclipse-workspace\\G12_CENG431_HW3-v1\\src\\trends.png"));
        btnNewButton_1_2.setBounds(285, 148, 109, 21);
        add(btnNewButton_1_2);
		this.setMainFrame(mainFrame);        

		
		
	}


	public MainFrame getMainFrame() {
		return mainFrame;
	}


	public void setMainFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
