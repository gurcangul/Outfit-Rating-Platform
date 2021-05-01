package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;

public class LoginPanel extends JPanel {
    private MainFrame mainFrame;
    private BeforeLoginPanel beforeLoginPanel;
	private static final long serialVersionUID = 1L;
	private JTextField userName;
	private JPasswordField password;
	private MenuPanel menuPanel;
	
	/**
	 * Create the panel.
	 */
	public LoginPanel(MainFrame mainFrame) {
		this.setMainFrame(mainFrame);        
        new JPanel(new GridLayout(3, 1));
        setLayout(null);
        
        userName = new JTextField();
        userName.setBounds(222, 182, 96, 19);
        add(userName);
        userName.setColumns(10);
        
        JButton btnNewButton = new JButton("Login"); 
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton.setBounds(311, 224, 85, 21);
        
        JLabel lblNewLabel = new JLabel("User Name:");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel.setBounds(149, 184, 63, 13);
        add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Password:");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_1.setBounds(356, 184, 63, 13);
        add(lblNewLabel_1);
        
        password = new JPasswordField();
        password.setBounds(424, 182, 108, 19);
        add(password);
        
        
        JButton btnNewButton_2_1 = new JButton("");//this is to go back button
        btnNewButton_2_1.setIcon(new ImageIcon("C:\\Users\\Gurcan\\eclipse-workspace\\G12_CENG431_HW3-v1\\src\\back.png"));
        btnNewButton_2_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		beforeLoginPanel =  new BeforeLoginPanel(mainFrame);
        		mainFrame.addNewPanel(beforeLoginPanel);
        		
        	}
        });
        btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_2_1.setBounds(273, 301, 154, 35);
        add(btnNewButton_2_1);
        
        JButton btnNewButton_1 = new JButton("Login");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		menuPanel =  new MenuPanel(mainFrame);
        		mainFrame.addNewPanel(menuPanel);
        	}
        });
        btnNewButton_1.setBounds(295, 233, 85, 21);
        add(btnNewButton_1);
        
        
        
        
	}

	public MainFrame getMainFrame() {
		return mainFrame;
	}

	public void setMainFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}

	public BeforeLoginPanel getBeforeLoginPanel() {
		return beforeLoginPanel;
	}

	public void setBeforeLoginPanel(BeforeLoginPanel beforeLoginPanel) {
		this.beforeLoginPanel = beforeLoginPanel;
	}
	
	
	public void passwordCheck(){
        password.setBackground(Color.RED);
    }
	
	public void allActionPerformed(ActionListener actionListener, JButton button ){
        if(button.getText().equals("login"))
        	button.addActionListener(actionListener);
    }
	public void allActionListener(ActionListener actionListener ){
       // if(button.getText().equals("login"))
        	//button.addActionListener(actionListener);
		//btnNewButton.addActionListener(actionListener);
    }
    public void addLoginActionListener(ActionListener actionListener){
        
    }

    public String getUsername(){
        return userName.getText();
    }

    public char[] getPassword(){
        return password.getPassword();
    }
    
    private void checkCredentials(String name, char[] password) {

    /*DataHandler dataHandler = new DataHandler();
    User user = dataHandler.getUser(username);*/
    	/*

    if(user != null && user.getPassword().equals(String.valueOf(password))){
        MenuView menuView = new MenuView(loginPanel.getFrame());
        MenuController menuController = new MenuController(menuView, user);
    }
    else{
    	loginPanel.securityCheckFailed();
    }*/

    }
}    
