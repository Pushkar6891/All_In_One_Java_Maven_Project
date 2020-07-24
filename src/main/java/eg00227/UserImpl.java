package eg00227;

public class UserImpl extends User {

	private ChattingMediator chattingMediator;
	private String username;

	public UserImpl(ChattingMediator chattingMediator, String username) {
		super(chattingMediator, username);
		this.chattingMediator = chattingMediator;
		this.username = username;
	}

	@Override
	public void sendMessage(String message) {
		System.out.println(username + " sending message: " + message);
		chattingMediator.sendMessage(message, this);
	}

	@Override
	public void receiveMessage(String message) {
		System.out.println(username + " received message: " + message);
	}

}
