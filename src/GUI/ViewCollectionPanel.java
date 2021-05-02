package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import Observer.Observer;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Entities.Collection;
import Entities.User;

public class ViewCollectionPanel extends JPanel implements Observer {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Collection collection;
    private MainFrame mainFrame;
    private User user;



	public ViewCollectionPanel(MainFrame mainFrame, Collection collection) {
        setMainFrame(mainFrame); 
        setCollection(collection);
		JPanel jP=  new JPanel(new GridLayout(3, 1));
		jP.setLayout(null);
        mainFrame.addNewPanel(jP);
    }
  

	public Collection getCollection() {
		return collection;
	}

	public void setCollection(Collection collection) {
		this.collection = collection;
	}

	public MainFrame getMainFrame() {
		return mainFrame;
	}

	public void setMainFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}

	@Override
	public void update(Object arg) {
		setUser((User) arg);
       System.out.println("MessageSubscriberOne :: " +  arg.toString());
		
	}

	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
}
