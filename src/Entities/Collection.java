package Entities;

import java.util.ArrayList;
import java.util.List;

import Observer.Observer;
import Observer.Subject;

public class Collection implements Subject{
    private List<Integer> outfitList;
    private List<Observer> observers= new ArrayList<>();

    private String name;

    public Collection(List<Integer> outfitList, String name) {
    	 setOutfits(outfitList);
         setName(name);
    }
    public Collection() {
        setOutfits(new ArrayList<>());
        setName("Unknown");
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
	public List<Integer> getOutfitList() {
		return outfitList;
	}
	public void setOutfits(List<Integer> outfitList) {
		this.outfitList = outfitList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
