package GUI;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JRadioButtonMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPanel extends JPanel {
	  private static final long serialVersionUID = 1L;

	  private MainFrame mainFrame;
	  private LoginPanel loginPanel;
	  private JTextField userName;
	  private JPasswordField password;

	public MenuPanel(MainFrame mainFrame) {
				this.setMainFrame(mainFrame);        
				JPanel jP=  new JPanel(new GridLayout(3, 1));
		        setLayout(null);
		        
		        JMenuBar menuBar = new JMenuBar();
		        menuBar.setBackground(Color.WHITE);
		        menuBar.setBounds(10, 10, 424, 22);
		        add(menuBar);
		        
		        JMenu mnNewMenu = new JMenu("Home Page");
		        menuBar.add(mnNewMenu);
		        JMenu mnNewMenu2 = new JMenu("My Profile");
		        menuBar.add(mnNewMenu2);
		        
		        JMenu mnNewMenu_1 = new JMenu("My Collections");
		        mnNewMenu2.add(mnNewMenu_1);
		        
		        JMenuItem mnıtmNewMenuItem_9 = new JMenuItem("See My Collections");
		        mnNewMenu_1.add(mnıtmNewMenuItem_9);
		        
		        JMenuItem mnıtmNewMenuItem_10 = new JMenuItem("Add A Collection");
		        mnNewMenu_1.add(mnıtmNewMenuItem_10);
		        
		        JMenuItem mnıtmNewMenuItem_11 = new JMenuItem("Remove A Collection");
		        mnNewMenu_1.add(mnıtmNewMenuItem_11);
		        

		        
		        JMenuItem mnıtmNewMenuItem_6 = new JMenuItem("Following");
		        mnNewMenu2.add(mnıtmNewMenuItem_6);
		        
		        JMenuItem mnıtmNewMenuItem_7 = new JMenuItem("Followers");
		        mnNewMenu2.add(mnıtmNewMenuItem_7);		        JMenuItem mnıtmNewMenuItem_5 = new JMenuItem("General Account Settings");
		        mnNewMenu2.add(mnıtmNewMenuItem_5);
		        JMenuItem mnıtmNewMenuItem = new JMenuItem("New menu item");
		        mnNewMenu.add(mnıtmNewMenuItem);
		        
		        JMenu mnNewMenu_2 = new JMenu("Collections");
		        menuBar.add(mnNewMenu_2);
		        
		        JMenuItem mnıtmNewMenuItem_1 = new JMenuItem("All Collection");
		        mnNewMenu_2.add(mnıtmNewMenuItem_1);
		        
		        JMenuItem mnıtmNewMenuItem_2 = new JMenuItem("My Collections");
		        mnNewMenu_2.add(mnıtmNewMenuItem_2);
		        
		        JMenuItem mnıtmNewMenuItem_3 = new JMenuItem("Add A Collection");
		        mnNewMenu_2.add(mnıtmNewMenuItem_3);
		        
		        JMenuItem mnıtmNewMenuItem_4 = new JMenuItem("Remove A Collection");
		        mnNewMenu_2.add(mnıtmNewMenuItem_4);
		        
		        JMenu mnNewMenu_5 = new JMenu("Trends");
		        mnNewMenu_5.setBackground(Color.WHITE);
		        menuBar.add(mnNewMenu_5);
		        
		        JMenuItem mnıtmNewMenuItem_15 = new JMenuItem("The most liked");
		        mnNewMenu_5.add(mnıtmNewMenuItem_15);
		        
		        JMenuItem mnıtmNewMenuItem_16 = new JMenuItem("The most disliked");
		        mnNewMenu_5.add(mnıtmNewMenuItem_16);
		        
		        JMenuItem mnıtmNewMenuItem_17 = new JMenuItem("The most followed user");
		        mnNewMenu_5.add(mnıtmNewMenuItem_17);
		        //User user = new User();
		        //user.getserName
		        
		        JMenu mnNewMenu_3 = new JMenu("userName");
		        menuBar.add(mnNewMenu_3);
		        
		        JMenuItem mnıtmNewMenuItem_8 = new JMenuItem("Log Out");
		        mnıtmNewMenuItem_8.addActionListener(new ActionListener() {
		        	@Override
		            public void actionPerformed(ActionEvent e) {
		               int result = JOptionPane.showConfirmDialog(mainFrame,"Sure? You want to exit?", "Swing Tester",
		                  JOptionPane.YES_NO_OPTION,
		                  JOptionPane.QUESTION_MESSAGE);
		               if(result == JOptionPane.YES_OPTION){
		                  //mainFrame.setTitle("You selected: Yes");
		            	   	loginPanel =  new LoginPanel(mainFrame);
		           			mainFrame.addNewPanel(loginPanel);
		                  
		               }else if (result == JOptionPane.NO_OPTION){
		            	   //mainFrame.setTitle("Outfit Rating Platform");
		               }else {
		            	   //mainFrame.setTitle("None selected");
		               }
		            }
		      
		        });
		        mnNewMenu_3.add(mnıtmNewMenuItem_8);
		        
		        JMenu mnNewMenu_4 = new JMenu("Help");
		        menuBar.add(mnNewMenu_4);
		        
		        JMenuItem mnıtmNewMenuItem_14 = new JMenuItem("Help Contents");
		        mnNewMenu_4.add(mnıtmNewMenuItem_14);
		        JMenuItem mnıtmNewMenuItem_12 = new JMenuItem("Send Feedback");
		        mnıtmNewMenuItem_12.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		FeedbackPanel feedbackPanel = new FeedbackPanel(mainFrame);
		        		mainFrame.addMenuPanel(feedbackPanel);
		        		
		        	}
		        });

		        mnNewMenu_4.add(mnıtmNewMenuItem_12);
		        
		        JMenuItem mnıtmNewMenuItem_13 = new JMenuItem("About");
		        mnNewMenu_4.add(mnıtmNewMenuItem_13);
		        mnıtmNewMenuItem_13.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		AboutAppPanel aboutPanel = new AboutAppPanel(mainFrame);
		        		mainFrame.addMenuPanel(aboutPanel);
		        		
		        	}
		        });
		       
		       
			}


	public LoginPanel getLoginPanel() {
		return loginPanel;
	}


	public void setLoginPanel(LoginPanel loginPanel) {
		this.loginPanel = loginPanel;
	}


	public JTextField getUserName() {
		return userName;
	}


	public void setUserName(JTextField userName) {
		this.userName = userName;
	}


	public MainFrame getMainFrame() {
		return mainFrame;
	}


	public void setMainFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}


	public JPasswordField getPassword() {
		return password;
	}


	public void setPassword(JPasswordField password) {
		this.password = password;
	}
}
