package Advice;

import teams.DynamicJoinPointInfo;
import teams.GeneralJoinPointInfo;

//import teams.JoinPointInfoExp;

public class MyAspect {
	public static long i = 1, j = 0, k = 0, b = 0, t = 0, d = 0, s = 0, m = 0,
			c = 0;

	public static void before_all() {
		s++;
		if (s > 1937470400 && s % 100 == 0) {
			// if(s > 379090000 && s % 100== 0 )//Call-h2-nodata
			// if(s > 1811300000 && s % 1000== 0 )//basicblock-h2-nodata
			// if(s> 886957000 && s % 10==0)//FieldAccess-h2-Nodata
			// if(s> 37853400 && s % 10 == 0 )//Execution-h2-NoData
			// if( s > 63610000 && s % 100==0)//Execution-xalan-Nodata
			System.err.println("Advice: Before all shadows " + s);
		}
	}

	public static void before_allBB(final String o, final long time,
			final String basicBlockLabel, final String method) {
		k++;
		if (k % 1000000000 == 0) {
			/*
			 * Date date = new Date(time); Format format = new
			 * SimpleDateFormat("yyyy MM dd HH:mm:ss");
			 */
			System.err.println("Advice " + k + " Entered basic block "
					+ basicBlockLabel + " in " + method + " method starts at "
					+ time/* format.format(date).toString() */+ " Object: " + o);
		}
	}

	public static void before_appBB(final String basicBlockLabel,
			final String method) {
		System.err.println("Advice: Entered basic block " + basicBlockLabel
				+ " " + method);
	}

	public static void before_basicBlock() {
		d++;
		if (d % 2147400000 == 0 && d % 29 == 0) {
			System.out.println("Advice: Entered basic block " + d);
		}
	}

	public static void before_basicBlock(final String info) {
		// String in = info;
		d++;
		if (d % 2147400000 == 0 && d % 29 == 0) {
			System.out.println("basic block:  " + info + "    " + d);
		}
	}

	public static void before_Call() {
		j++;
		if (j > 916746870 && j % 10 == 0) {
			System.out.println("You are in Advice for Call Without Data: "
					+ "  " + j);
		}
	}

	public static void before_Call(final String method) {
		j++;
		if (j > 986730000 && j % 100 == 0) {
			System.out.println("You are in Advice for Call of Method: "
					+ method + "  " + j);
		}
	}

	public static void before_Call(final String callee, final String caller) {
		j++;
		if (j > 986730000 && j % 100 == 0) {
			System.out.println("Advice for call in caller: " + caller + "  "
					+ j + "   for callee:  " + callee);
		}
	}

	public static void before_Execution() {
		m++;
		// if (m > 888225680 && m % 10 == 0) { // h2_NoData
		if (m > 62520000) {// xalan_NoData
			System.out.println("You are in Advice for Execution of Method: "
					+ "  " + m);
		}
	}

	public static void before_Execution(final GeneralJoinPointInfo staticInfo,
			final DynamicJoinPointInfo DynInfo) {
		m++;
		System.out.println("You are in Advice for Execution of Method: ");
		// + staticInfo.getMethodNode().name + "  " + m);//
		// L+" "+" "+time+" "+M);
	}

	public static void before_Execution(final Object staticInfo,
			final Object DynInfo) {
		m++;
		System.out.println("You are in Advice for Execution of Method: " + "  "
				+ m);// L+" "+" "+time+" "+M);
	}

	public static void before_Execution(final String method) {
		m++;
		//if (m > 888225680 && m % 10 == 0) {// h2_Data
			// if (m > 58370000 && m % 100 == 0) {// xalan_Data
			System.out.println("You are in Advice for Execution of Method: "
					+ method + "  " + m);
		//}
	}

	public static void after_Execution(final String method) {
		m++;
		//if (m > 888225680 && m % 10 == 0) {// h2_Data
			// if (m > 58370000 && m % 100 == 0) {// xalan_Data
			System.out.println("You are in Advice for Execution of Method: "
					+ method + "  " + m);
		//}
	}

	public static void before_Execution(final String method,
			final String signature, final String className) {
		m++;
		if (m > 888225680 && m % 10 == 0) {// h2_Data
			// if (m > 58370000 && m % 100 == 0) {// xalan_Data
			System.out.println("You are in Advice for Execution of Method: "
					+ method + "  " + m + "  " + signature + "  " + className);
		}
	}

	public static void before_FieldAccess() {
		b++;
		if (b % 2140000000 == 0 && b % 17 == 0 & b % 29 == 0) {
			System.out.println("Adice for field Access  " + b);
		}
	}

	public static void before_FieldAccess(final String value) {
		b++;
		if (b % 2140000000 == 0 && b % 17 == 0 & b % 29 == 0) {
			System.out.println("Adice for field Access  " + b + "  " + value);
		}
	}

	public static void before_Loop() {
		m++;
		// if (m > 888225680 && m % 10 == 0) { // h2_NoData
		// if (m > 62520000) {// xalan_NoData
		System.out.println("You are in Advice for Loop of Method: " + "  " + m);
		// }
	}

	public static void ExecutionBlockId(final String blockId) {
		b++;
		if (b > 1811300000 && blockId.equals("BLOCK1")) {
			System.out.println("Block ID: " + blockId + "  " + b);// L+" "+" "+time+" "+M);
		}
		// return time;
	}

	public static void ExecutionTime(final long time) {
		t++;
		if (t % 10 == 0) {// if (t >50127000 && t%100==0){/*FIELDaCCESS*///if
							// (t% 10000000== 0){basicblock
			System.out.println("Execution time: " + time + " " + t);// L+" "+" "+time+" "+M);
		}
		// return time;
	}

	public static void FieldAccess(final String owner, final String name,
			final String value) {
		b++;
		// if(owner.contains("current"))
		if (value.equals("test") && b > 1937470400) {// (b% 1000000000== 0){
			System.out.println(b + "  Owner class: " + owner + " Field name: "
					+ name + " Current Value:" + value);// L+" "+" "+time+" "+M);
		}
		// return time;
	}

	public static void main(final String arsv[]) {
		System.out.println("Advice Class!");
	}

	public int i1;
}
