package eg00227;

public abstract class User {

	private ChattingMediator chattingMediator;
	private String username;

	public User() {
	}

	public User(ChattingMediator chattingMediator, String username) {
		super();
		this.chattingMediator = chattingMediator;
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public abstract void sendMessage(String message);

	public abstract void receiveMessage(String message);

}
