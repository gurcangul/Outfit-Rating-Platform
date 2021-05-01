package GUI;

import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomePanel extends JPanel{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private MainFrame mainFrame;
    private JButton btnNewButton;
    private JLabel lblNewLabel;
    private BeforeLoginPanel beforeLoginPanel;
    private JButton btnNewButton_1;

    public WelcomePanel(MainFrame mainFrame) {
        this.setMainFrame(mainFrame);

        new JPanel(new GridLayout(3, 1));       
        setSize(760, 460);
        setLayout(null);

        mainFrame.addNewPanel(this);
        
        btnNewButton = new JButton("ENTER");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		beforeLoginPanel =  new BeforeLoginPanel(mainFrame);
        		mainFrame.addNewPanel(beforeLoginPanel);
        	}
        });
        btnNewButton.setBounds(293, 263, 110, 21);
        add(btnNewButton);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Gurcan\\eclipse-workspace\\G12_CENG431_HW3-v1\\src\\logo.png"));
        lblNewLabel.setBounds(292, 143, 110, 113);
        add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Welcome to the Outfit Rating Platform");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_1.setBounds(212, 84, 303, 36);
        add(lblNewLabel_1);
        
        btnNewButton_1 = new JButton("About");
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JOptionPane.showMessageDialog(null, "Copyright© 2021 All rights reserved. ");
        		/*@SuppressWarnings("unused")
				AboutAppPanel aboutPanel = new AboutAppPanel(mainFrame);
        		mainFrame.addNewPanel(aboutPanel);*/ 

        		
        	}
        });
        btnNewButton_1.setForeground(Color.BLACK);
        btnNewButton_1.setBackground(Color.LIGHT_GRAY);
        btnNewButton_1.setBounds(320, 408, 59, 21);
        add(btnNewButton_1);
    }

    public MainFrame getFrame() {
        return mainFrame;
    }


	public MainFrame getMainFrame() {
		return mainFrame;
	}

	public void setMainFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}
}
