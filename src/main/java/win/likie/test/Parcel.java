package win.likie.test;

interface Destination {
	String readLabel();
}

/**
 * Created by Wuhuahui on 2016/12/27.
 */
abstract class Contents {
	abstract public int value();
}

public class Parcel {
	public Destination dest(String s) {
		return new PDestination(s);
	}

	public Contents cont() {
		return new PContents();
	}

	private class PContents extends Contents {
		private int i = 11;

		public int value() {
			return i;
		}
	}

	protected class PDestination implements Destination {
		private String label;

		private PDestination(String whereTo) {
			label = whereTo;
		}

		public String readLabel() {
			return label;
		}
	}
}

class Test1 {
	public static void main(String[] args) {
		Parcel p = new Parcel();
		Contents c = p.cont();
		Destination d = p.dest("Tanzania");
// Illegal -- can't access private class:
//	 Parcel.PContents c = p.new PContents();
	}
}