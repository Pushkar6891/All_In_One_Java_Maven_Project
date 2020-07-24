package eg00231;

//this is observer 2
public class ObserverImplSecondMessageSubscriber implements Observer {

	@Override
	public void updateObserver(Message message) {
		System.out.println("Message for second subscriber : " + message.getMessage());
	}

}
