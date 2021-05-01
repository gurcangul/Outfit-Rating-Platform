package Controller;

import java.awt.event.ActionListener;
import GUI.LoginPanel;
import java.awt.event.ActionEvent;


public class LoginController {

    private final LoginPanel loginPanel;

    public LoginController(LoginPanel loginPanel) {
        this.loginPanel = loginPanel;
        loginPanel.allActionListener(new loginActionListener());
    }

    private class loginActionListener implements ActionListener {
    	
        @Override
        public void actionPerformed(ActionEvent e) {
            checkCredentials(loginPanel.getName(), loginPanel.getPassword());
        }
    }

    private void checkCredentials(String username, char[] password) {

        /*DataHandler dataHandler = new DataHandler();
        User user = dataHandler.getUser(username);

        if(user != null && user.getPassword().equals(String.valueOf(password))){
            MenuView menuView = new MenuView(loginPanel.getFrame());
            MenuController menuController = new MenuController(menuView, user);
        }
        else{
        	loginPanel.securityCheckFailed();
        }*/
    }



}
