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

public class HomePage extends JPanel {

	  private MainFrame mainFrame;

	  
	public HomePage(MainFrame mainFrame) {
		JPanel jP=  new JPanel(new GridLayout(3, 1));
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        
        JPopupMenu popupMenu = new JPopupMenu();
        addPopup(this, popupMenu);
        
        JCheckBoxMenuItem chckbxmnıtmNewCheckItem_1 = new JCheckBoxMenuItem("New check item");
        popupMenu.add(chckbxmnıtmNewCheckItem_1);
        
        JCheckBoxMenuItem chckbxmnıtmNewCheckItem = new JCheckBoxMenuItem("New check item");
        popupMenu.add(chckbxmnıtmNewCheckItem);
        
        JLabel lblNewLabel = new JLabel("New label");
        add(lblNewLabel);
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
