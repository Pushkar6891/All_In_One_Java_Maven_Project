package eg00553;

public class BracketBalancedTester {

	public static void main(String[] args) {
		StackImpl a = new StackImpl();

		String st = "a[b+{c*(u-r)}]";
		System.out.println("Are Brackets Balanced : " + st);
		System.out.println(a.checkCorrectBracket(st));
		System.out.println();

		
		String st1 = "a[b+{c*(u-r)}}]";
		System.out.println("Are Brackets Balanced : " + st1);
		System.out.println(a.checkCorrectBracket(st1));
		System.out.println();

		String st2 = "a+b+c*u-r)}}]";
		System.out.println("Are Brackets Balanced : " + st2);
		System.out.println(a.checkCorrectBracket(st2));
		System.out.println();

		String st3 = "a[[b+{c*(u-r)}]";
		System.out.println("Are Brackets Balanced? : " + st3);
		System.out.println(a.checkCorrectBracket(st3));
		System.out.println();
	}

}