package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import Entities.Collection;
import Entities.User;
import GUI.MainFrame;
import GUI.MenuPanel;
import GUI.ViewCollectionPanel;
import Observer.Data;

public class CollectionController {
    private final User user;
    private final ViewCollectionPanel viewCollectionPanel;
    private final List<Collection> allCollections;
    private final Data data;
    private MainFrame mainFrame;

    public CollectionController(User user, ViewCollectionPanel viewCollectionPanel) {
        this.user = user;
        this.viewCollectionPanel = viewCollectionPanel;
        this.data = new Data();

        user.attach(viewCollectionPanel);
        user.attach(viewCollectionPanel);

        viewCollectionPanel.viewAllActionListener(new createCollectionActionListener());
        /*viewCollectionPanel.addOpenCollectionButton(new openCollectionActionListener());
        viewCollectionPanel.addMainMenuActionListener(new mainMenuActionListener());
        viewCollectionPanel.addOpenCollectionMouseListener(new openCollectionMouseListener());*/

        this.allCollections = new ArrayList<>();
        allCollections.addAll(user.getCollectionList());
        List<Collection> followingsCollections = new ArrayList<>();
        for(String username: user.getFollowingList()){
            System.out.println(username);
            followingsCollections.addAll(data.getUser(username).getCollectionList());
        }
        allCollections.addAll(followingsCollections);
        viewCollectionPanel.addCollectionLists(followingsCollections);
    }

    private class createCollectionActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    }

    private class openCollectionActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        }
    }

    private class mainMenuActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            MenuPanel menuPanel = new MenuPanel(viewCollectionPanel.getMainFrame());
            MenuController menuController = new MenuController(menuPanel, user);
        }
    }

 

}
