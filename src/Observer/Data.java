package Observer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import Entities.Outfit;
import Entities.User;

public class Data  implements IData, Observer {
	
    Map<String,User> userMap;
    Map<Integer,Outfit> outfitMap;

    public Data() {

    }

    public void observeUsers(){
        for(User u: userMap.values()){
            u.attach(this);
        }
    }

    public List<String> getUserNameList1() {
        return new ArrayList<>(userMap.keySet());
    }

    public User getUser(String username){
        return userMap.get(username);
    }

    public Outfit getOutfit(int id) {
        return outfitMap.get(id); 
    }

    public void putUser(User user){
        userMap.put(user.getUserName(), user);
    }

    public void putOutfit(Outfit outfit){
    }
	public void attach(Subject s, Object arg) {
        if(s instanceof Outfit){
            Outfit outfit = (Outfit) s;
            putOutfit(outfit);
        }else{
            User user = (User) s;
            putUser(user);
        }
    }

    public static void main(String[] args) {
        Data d = new Data();
        d.putUser(new User("admin", "password", new ArrayList<>(), new ArrayList<>(), 
        		new ArrayList<>(), new ArrayList<>(), new ArrayList<>()));
    }

	@Override
	public List<String> getUserNameList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Object arg) {
		// TODO Auto-generated method stub
		
	}




}
