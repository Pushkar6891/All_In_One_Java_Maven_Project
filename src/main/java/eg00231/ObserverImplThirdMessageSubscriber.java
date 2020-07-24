package eg00231;

// this is observer 3
public class ObserverImplThirdMessageSubscriber implements Observer {

	@Override
	public void updateObserver(Message message) {
		System.out.println("Message for third subscriber : " + message.getMessage());
	}

}
