package eg00231;

// this is observer 1
public class ObserverImplFirstMessageSubscriber implements Observer {

	@Override
	public void updateObserver(Message message) {
		System.out.println("Message for first subscriber : " + message.getMessage());
	}

}
