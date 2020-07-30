package eg00413;

public interface Subject {
	void register(Observer obj);

	void unregister(Observer obj);

	void notifyObservers();
}