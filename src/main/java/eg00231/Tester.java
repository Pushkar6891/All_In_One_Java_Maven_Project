package eg00231;

public class Tester {

	public static void main(String[] args) {

		ObserverImplFirstMessageSubscriber observer1 = new ObserverImplFirstMessageSubscriber();
		ObserverImplSecondMessageSubscriber observer2 = new ObserverImplSecondMessageSubscriber();
		ObserverImplThirdMessageSubscriber observer3 = new ObserverImplThirdMessageSubscriber();

		SubjectImplMessagePublisher subject = new SubjectImplMessagePublisher();

		subject.register(observer1);
		subject.register(observer2);

		// observer1 and observer2 will receive update
		Message message1 = new Message("This is First Message");
		subject.notifyUpdate(message1);

		System.out.println("=============================");

		subject.unregister(observer1);
		subject.register(observer3);

		// observer2 and observer3 will receive update
		Message message2 = new Message("This is Second Message");
		subject.notifyUpdate(message2);

		System.out.println("=============================");

		subject.unregister(observer2);

		// observer3 will receive update
		Message message3 = new Message("This is Third Message");
		subject.notifyUpdate(message3);
		System.out.println("=============================");
	}

}
