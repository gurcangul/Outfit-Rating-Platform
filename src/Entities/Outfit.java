package Entities;

import java.util.ArrayList;
import java.util.List;

import Observer.Observer;
import Observer.Subject;

public class Outfit implements Subject {
    private List<Observer> observerList = new ArrayList<>();

	@Override
	public void attach(Observer o) {
    	observerList.add(o);
		
	}

	@Override
	public void detach(Observer o) {
    	observerList.remove(o);
		
	}

	@Override
	public void notifyUpdate(Object arg) {
		for(Observer o: observerList) {
            o.update(arg);
        }		
	}

}
