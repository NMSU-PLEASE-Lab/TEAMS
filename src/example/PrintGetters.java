package example;

public class PrintGetters {
	private static long i = 0, j = 0, k = 0, l = 0, b = 0;
	public static long start;

	public static void after_PCGet() {
		System.out
				.println("Advice:\t\tAdvice method is invoked after the methode execution.");
	}

	public static void before_allBB() {
		b++;
		if (b % 10000 == 0) {
			System.err.println("Advice: Entered basic block " + b);
		}
	}

	public static void before_allBB(final String basicBlockLabel,
			final String method) {
		System.err.println("Advice: Entered basic block " + basicBlockLabel
				+ " " + method);
	}

	public static void before_appBB(final String basicBlockLabel,
			final String method) {
		System.err.println("Advice: Entered basic block " + basicBlockLabel
				+ " " + method);
	}

	public static void before_basicBlock(final String info) {
		// System.out.println("Advice: is invoked before the basic block.");
		// String in = info;
		k++;
		if (k % 100000000 == 0) {
			// if(k>1356898500 && k%100 == 0) // Number of basic black in xalan
			System.out.println("basic block    " + info + "  " + k);
		}

	}

	public static void before_fieldAccess(final String info) {
		// System.out.println("Advice:\t\tAdvice method is invoked before the method execution. ");
		// String in = info;
		l++;
		// if (l > 297876733)//h2
		if (l >= 892212000) {
			System.out.println("FieldAccess    " + info + "  " + l);
		}

	}

	public static void before_PCGet() {
		// System.out.println("Advice in Execution!");
		i++;
		// if (i> 17348) //execution(* get()) && within(org/apache);
		if (i > 3057400 && i % 100 == 0) {
			System.out.println("Advice in PCGET: " + i);
		}
	}

	public static void inBasicBlock(final String method, final String info) {
		System.out.println("Advice:\t\tThe basic block starts at " + info
				+ " inside the Method: " + method);
	}

	public static void inCall(final String method, final String info) {
		System.out.println("Advice:\t\tThe method " + method
				+ " invoked inside: " + info);
	}

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		final teams.Aspect aspect = new teams.Aspect();
		aspect.parseGrammar("../src/extension/testAspect");
		System.out.println(aspect.getPointcut().get(0).getName());
		System.out.println(aspect.getPointcut().get(1).getName());
		// System.out.println(aspect.getPointcut().elementAt(0).getPC().interpret());
		System.out.println("Advice:\tRun OK");
		System.out.println("Advice:\tEnd of the program");

	}

	public static void onCall_PCGet(final String info) {
		// System.out.println("Advice:\t\tAdvice method is invoked before the method execution. ");
		// String in = info;
		// if (j ==1 ) start = System.currentTimeMillis();
		// System.out.println("Advice incall    "+j);
		// long l =0;
		/*
		 * while (l<1000){
		 * 
		 * l++; }
		 */
		j++;
		// if (j> 16974090 ){//call(* get()) && within(org/h2) && withincode(*
		// get());
		if (j % 10 == 0) {
			System.out.println("Advice count in call = " + j);
		}
	}

}
