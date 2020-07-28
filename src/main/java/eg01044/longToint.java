package eg01044;

public class longToint {

	public static void main(String[] args) {

		longToint obj = new longToint();
		obj.convertlongTointByExplicitTypeCasting();
		obj.convertlongTointUsingnewLongAndintValue();
	}

	// 1. Using int i = (int) l;
	public void convertlongTointByExplicitTypeCasting() {
		long l = 982639646L;
		int i = (int) l;
		System.out.println(i);
	}

	// 2. Using int i = longVal.intValue();
	public void convertlongTointUsingnewLongAndintValue() {
		long l = 982639646L;
		Long longVal = new Long(l);
		int i = longVal.intValue();
		System.out.println(i);
	}

}