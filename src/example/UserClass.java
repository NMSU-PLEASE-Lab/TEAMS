package example;

public class UserClass {
	public static void getApplicationMethod1() {
		System.out.println("getApplicationMethod1 is running...");
		final UserClass2 c2 = new UserClass2();
		for (int i = 0; i < 10; i++) {
			System.out.println("Loop 1 iteration  " + i
					+ " as a part of application running.");
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Loop 2 iteration  " + i
					+ " as a part of application running.");
		}
		c2.method1();
	}

	public static void main(final String[] args) {
		final UserClass userObject = new UserClass();
		UserClass.getApplicationMethod1();
		userObject.getApplicationMethod2();
	}

	private int field2;

	public void getApplicationMethod2() {
		System.out.println("getApplicationMethod2 is running...");
	}

	public int getField2() {
		return field2;
	}

	public void setField2(final int field2) {
		this.field2 = field2;
	}
}
