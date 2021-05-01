package GUI;

import javax.swing.JPanel;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.Choice;
import java.awt.List;
import javax.swing.JComboBox;
import java.awt.ScrollPane;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.TextArea;
import javax.swing.JLayeredPane;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Component;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;

public class FeedbackPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MainFrame mainFrame ;

	/**
	 * Create the panel.
	 * @param mainFrame 
	 */
	public FeedbackPanel(MainFrame mainFrame) {
		
		JLayeredPane layeredPane = new JLayeredPane();
		this.setMainFrame(mainFrame);
		setLayout(new MigLayout("", "[50px][66px][50px]", "[50px][][][][][]"));
		
		Label label = new Label("User Name");
		add(label, "cell 0 0,alignx left,aligny top");
		
		TextField textField = new TextField();
		add(textField, "cell 1 0,alignx left,aligny top");
		textField.setText("name");
		textField.setEditable(false);
		textField.setEnabled(false);
		
		Label label_1 = new Label("Message");
		add(label_1, "cell 0 1,alignx left,aligny top");
		
		TextArea textArea = new TextArea();
		add(textArea, "cell 1 1,alignx left,aligny top");
		
		Label label_1_1 = new Label("Subject");
		add(label_1_1, "cell 0 2,alignx left,aligny top");
		
		final Choice choice = new Choice();
		add(choice, "cell 1 2,alignx left,aligny top");
		
		choice.add("Item 1");  
		choice.add("Item 2");  
		choice.add("Item 3");
        
        JButton btnNewButton = new JButton("Send");
        add(btnNewButton, "cell 0 3");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(check(textArea))
        		{
	        		String toBewrite = label.getText() + "," + textArea.getText();
		            try {
						writeToFile(toBewrite);
					} catch (IOException e1) {
					}
		            JOptionPane.showMessageDialog(null, "Your message is submitted. Thank you! ");
		            textArea.setText("");
        		}
        		
        	}
        });
        add(btnNewButton);
		
	}

	public MainFrame getMainFrame() {
		return mainFrame;
	}

	public void setMainFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}  
	 private boolean check(TextArea textArea) {
	        if (textArea.getText().length() <4 ) {
	        	JOptionPane.showMessageDialog(null, "You cannot send messages of this length ");
	        	//You cannot send messages of this length
				return false;

	        }
	        else return true;
	 }
	
	
	private void writeToFile(String list) throws IOException{
		File f = new File("feedback.txt");
		FileWriter fw = new FileWriter(f,true);
		try
		{
			BufferedWriter bw = new BufferedWriter(fw);
		    bw.newLine();
		    bw.write(list);
		    bw.flush();
		    bw.close();
        }
        catch(Exception e){
        }
	}
}
