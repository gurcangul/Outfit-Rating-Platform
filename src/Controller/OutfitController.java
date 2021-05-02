package Controller;

import Entities.Outfit;
import Entities.User;
import GUI.OutfitPanel;
import Observer.Data;

public class OutfitController {
    private Data allData;
    private User user;
	private final Outfit outfit;
    private final OutfitPanel outfitPanel;


    public Data getAllData() {
		return allData;
	}

	public void setAllData(Data allData) {
		this.allData = allData;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Outfit getOutfit() {
		return outfit;
	}

	public OutfitPanel getOutfitPanel() {
		return outfitPanel;
	}

	public OutfitController(Outfit outfit, OutfitPanel outfitPanel, User user) {
        this.outfit = outfit;
        this.outfitPanel = outfitPanel;
        setAllData(new Data());
        setUser(user);

        outfit.attach(allData);
        user.attach(allData);

    }

    

}
