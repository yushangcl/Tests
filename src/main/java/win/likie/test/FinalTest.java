package win.likie.test;

/**
 * Created by Wuhuahui on 2016/12/27.
 */
//: FinalData.java
// The effect of final on fields
class Value {
	int i = 1;
}

public class FinalTest {
	// Typical public constant:
	public static final int I3 = 39;
	static final int I2 = 99;
	static final int i5 = (int) (Math.random() * 20);
	static final Value v3 = new Value();
	// Can be compile-time constants
	final int i1 = 9;
	// Cannot be compile-time constants:
	final int i4 = (int) (Math.random() * 20);
	final Value v2 = new Value();
	//! final Value v4; // Pre-Java 1.1 Error:
	// no initializer
	// Arrays:
	final int[] a = {1, 2, 3, 4, 5, 6};
	Value v1 = new Value();

	public static void main(String[] args) {
		FinalTest fd1 = new FinalTest();
		//! fd1.i1++; // Error: can't change value
		fd1.v2.i++; // Object isn't constant!
		fd1.v1 = new Value(); // OK -- not final
		for (int i = 0; i < fd1.a.length; i++)
			fd1.a[i]++; // Object isn't constant!
			//! fd1.v2 = new Value(); // Error: Can't
			//! fd1.v3 = new Value(); // change handle
			//! fd1.a = new int[3];
		fd1.print("fd1");
		System.out.println("Creating new FinalData");
		FinalTest fd2 = new FinalTest();
		fd1.print("fd1");
		fd2.print("fd2");
	}

	public void print(String id) {
		System.out.println(
				id + ": " + "i4 = " + i4 +
						", i5 = " + i5);
	}
} ///:~