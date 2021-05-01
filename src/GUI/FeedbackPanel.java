package GUI;

import javax.swing.JPanel;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.Choice;
import java.awt.List;
import javax.swing.JComboBox;
import java.awt.ScrollPane;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.ActionListener;
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
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		TextArea textArea = new TextArea();
		add(textArea);
		
		Label label = new Label("User Name");
		add(label);
		
		TextField textField = new TextField();
		add(textField);
		textField.setText("name");
		textField.setEditable(false);
		textField.setEnabled(false);
		
		Label label_1 = new Label("Message");
		add(label_1);
		
		final Choice choice = new Choice();
		add(choice);
		
		Label label_1_1 = new Label("Subject");
		add(label_1_1);
		
		Button button = new Button("Send");
		add(button);
		button.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		choice.add("Item 1");  
		choice.add("Item 2");  
		choice.add("Item 3");

	}

	public MainFrame getMainFrame() {
		return mainFrame;
	}

	public void setMainFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}
}
