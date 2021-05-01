package GUI;

import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JLayeredPane;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JScrollPane;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.Font;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.TextField;

public class AboutAppPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3847238445785672779L;
	private MainFrame mainFrame ;
	//MenuPanel menuPanel;
	/**
	 * Create the panel.
	 * @param jP 
	 */
	public AboutAppPanel(MainFrame mainFrame ) {
		this.setMainFrame(mainFrame);        
		JPanel jP=  new JPanel(new GridLayout(3, 1));
		String info="This Application created by \nAynur Atış  and \nGürcan Gül";
		setLayout(new BorderLayout(0, 0));Label label = new Label(info);
		label.setAlignment(Label.CENTER);
		add(label, BorderLayout.NORTH);
		JLabel lblNewLabel2 = new JLabel("Copyright© 2021 All rights reserved.");

		info="Copyright© 2021 All rights reserved.";
		add(lblNewLabel2);
		
		



	}
	public MainFrame getMainFrame() {
		return mainFrame;
	}
	public void setMainFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}
	

}
