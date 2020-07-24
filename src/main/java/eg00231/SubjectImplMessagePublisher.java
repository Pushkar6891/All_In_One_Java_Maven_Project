package eg00231;

import java.util.HashSet;
import java.util.Set;

public class SubjectImplMessagePublisher implements Subject {

	private Set<Observer> observers = new HashSet<>();

	@Override
	public void register(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unregister(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyUpdate(Message message) {
		for (Observer observer : observers) {
			observer.updateObserver(message);
		}

	}

}
