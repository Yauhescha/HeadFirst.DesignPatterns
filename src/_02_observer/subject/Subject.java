package _02_observer.subject;

import _02_observer.observer.Observer;

public interface Subject {
	void registerObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObserver();
}
