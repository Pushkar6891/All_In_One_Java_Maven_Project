package eg00227;

public class Tester {

	public static void main(String[] args) {
		ChattingMediator chattingMediator = new ChattingMediatorImpl();
		User user1 = new UserImpl(chattingMediator, "user1");
		User user2 = new UserImpl(chattingMediator, "user2");
		User user3 = new UserImpl(chattingMediator, "user3");
		User user4 = new UserImpl(chattingMediator, "user4");
		User user5 = new UserImpl(chattingMediator, "user5");

		chattingMediator.addUser(user1);
		chattingMediator.addUser(user2);
		chattingMediator.addUser(user3);
		chattingMediator.addUser(user4);
		chattingMediator.addUser(user5);

		user2.sendMessage("Hi, All");
	}
}
