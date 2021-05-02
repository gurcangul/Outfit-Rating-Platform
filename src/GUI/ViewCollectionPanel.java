package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

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
    private User user;
    private MainFrame mainFrame;
    private List<Collection> collectionLists;

    JList<String> collectionsList;
    JButton allCollection;

	public ViewCollectionPanel(MainFrame mainFrame, Collection collection) {
        this.setMainFrame(mainFrame); 
        JPanel jP=  new JPanel(new GridLayout(3, 1));
		jP.setLayout(null);
        setLayout(null);
		
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 37, 590, 161);

        add(scrollPane);
        
        collectionsList = new JList();
        scrollPane.setViewportView(collectionsList);
        
        allCollection = new JButton("All Collections");
        allCollection.setBounds(37, 232, 114, 21);
        add(allCollection);
        
        JButton btnNewButton_1 = new JButton("My Collections");
        btnNewButton_1.setBounds(175, 232, 114, 21);
        add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("Following");
        btnNewButton_2.setBounds(305, 232, 114, 21);
        add(btnNewButton_2);
        
        JButton btnNewButton_2_1 = new JButton("Not Following");
        btnNewButton_2_1.setBounds(429, 232, 114, 21);
        add(btnNewButton_2_1);
        showComponents();
        
        setCollection(collection);
		
	
		
        mainFrame.addNewPanel(jP);
        
        
    }
  
    private void showComponents() {
        List<Collection> allCollections = new ArrayList();
        allCollections.addAll(user.getCollectionList());
        String[] CollectionsArr = new String[allCollections.size()];
        int i = 0;
        for(Collection wl: allCollections){
            CollectionsArr[i] = "<html><body>" + wl.getName() + "<br>" + " " + "<br>" + "</span></body></html>}";
            i++;
        }
        collectionsList.setListData(CollectionsArr);
    }
	public Collection getCollection() {
		return collection;
	}

	public void setCollection(Collection collection) {
		this.collection = collection;
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
	
	public void viewAllActionListener(ActionListener actionListener) {
		//allCollection.addActionListener(actionListener);
		//showComponents();
		
    }
	
	public void addCollectionLists(List<Collection> collectionList){
		  collectionLists.addAll(collectionList);
		  showComponents();
	}
	
	
	
	 public void addCreateCollectionButton(ActionListener actionListener) {
		 allCollection.addActionListener(actionListener);
	    }

	public MainFrame getMainFrame() {
		return mainFrame;
	}

	public void setMainFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}
	
}
