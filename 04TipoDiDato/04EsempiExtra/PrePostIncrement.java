import java.util.Scanner;

public class PrePostIncrement {
	public static void main(String[] args) {
		int n = 42;
		int p = ++n + n++;
		System.out.println("n = " + n + "\tp = " + p);

		p = n++ + ++n;
		System.out.println("n = " + n + "\tp = " + p); 
	}
}