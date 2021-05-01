package Entities;

import java.util.ArrayList;
import java.util.List;

import Observer.Observer;
import Observer.Subject;

public class User implements Subject {
	private String userName;
    private String password;
    private List<Observer> observers = new ArrayList<>();
    private List<String> followingList;
    private List<String> followerList;
    private List<Integer> likedOutfitList;
    private List<Integer> dislikedOutfitList;
    private List<Collection> collectionList;  
    
	/**
	 * @param username
	 * @param password
	 * @param followingList
	 * @param followerList
	 * @param likedOutfitList
	 * @param dislikedOutfitList
	 * @param collectionList
	 */
	public User(String userName, String password, List<String> followingList,
			List<String> followerList, List<Integer> likedOutfitList, List<Integer> dislikedOutfitList,
			List<Collection> collectionList) {
		super();
		this.userName = userName;
		this.password = password;
		this.followingList = followingList;
		this.followerList = followerList;
		this.likedOutfitList = likedOutfitList;
		this.dislikedOutfitList = dislikedOutfitList;
		this.collectionList = collectionList;
	}
    public User(User user){
        this(user.getUserName(), user.getPassword(), user.getFollowingList(), user.getFollowerList(),
        		user.getLikedOutfitList(), user.getDislikedOutfitList(), user.getCollectionList());

    }
	
    
    
	
	public List<String> getFollowingList() {
		return followingList;
	}

	public void setFollowingList(List<String> followingList) {
		this.followingList = followingList;
	}

	public List<String> getFollowerList() {
		return followerList;
	}

	public void setFollowerList(List<String> followerList) {
		this.followerList = followerList;
	}

	public List<Integer> getLikedOutfitList() {
		return likedOutfitList;
	}

	public void setLikedOutfitList(List<Integer> likedOutfitList) {
		this.likedOutfitList = likedOutfitList;
	}

	public List<Integer> getDislikedOutfitList() {
		return dislikedOutfitList;
	}

	public void setDislikedOutfitList(List<Integer> dislikedOutfitList) {
		this.dislikedOutfitList = dislikedOutfitList;
	}

	public List<Collection> getCollectionList() {
		return collectionList;
	}

	public void setCollectionList(List<Collection> collectionList) {
		this.collectionList = collectionList;
	}

	@Override
	public void attach(Observer o) {
        observers.add(o);
		
	}

	@Override
	public void detach(Observer o) {
        observers.remove(o);
		
	}

	@Override
	public void notifyUpdate(Object arg) {
		for(Observer o: observers) {
            o.update(arg);
        }		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	
	
}
