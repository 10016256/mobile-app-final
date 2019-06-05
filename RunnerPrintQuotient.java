public class RunnerPrintQuotient {

	public static void main(String args[]) {
		InterfaceSud inter = (float f1, float f2)->System.out.printf("%.3f%n",f1/f2);
		inter.takein(12f,10f);
	}

}

interface InterfaceSud {

	public void takein (float f1, float f2);

}