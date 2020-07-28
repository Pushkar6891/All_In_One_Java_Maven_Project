package eg01006;

public class StringToObject {

	public static void main(String[] args) throws ClassNotFoundException {

		StringToObject obj = new StringToObject();
		obj.convertStringToObject();
		obj.convertStringToObjectUsingReflection();
	}

	// 1. Using Object obj = str;
	public void convertStringToObject() {
		String str = "hello";
		Object obj = str;
		System.out.println(obj);
	}

	// 2. Using Reflection to Convert String to Class Object
	public void convertStringToObjectUsingReflection() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String");
		System.out.println("Class Name of clazz Object : " + clazz.getName());
		System.out.println("Super Class name of clazz Object : " + clazz.getSuperclass().getName());
	}

}
