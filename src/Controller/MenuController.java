package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Entities.User;
import GUI.MenuPanel;
import GUI.ViewAllUsers;
import Observer.Data;
import Observer.IData;


public class MenuController {//controller
    private final MenuPanel menuPanel;
    private final User user;

    public MenuController(MenuPanel menuPanel, User user) {
        this.menuPanel = menuPanel;
        this.user = user;
       
    }




}
