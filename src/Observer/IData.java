package Observer;

import java.util.List;

import Entities.Outfit;
import Entities.User;

public interface IData {
    public Entities.User getUser(String userName);
    public void putUser(User user);
    public List<String> getUserNameList();
    public Outfit getOutfit(int id);
    public void putOutfit(Outfit video);
}
