package win.likie.test;

/**
 * Created by Wuhuahui on 2017/1/14.
 */
public class Hare implements Runnable {
	private boolean[] flags = {true, false};
	private int totalstep;
	private int step;

	public Hare(int totalstep) {
		this.totalstep = totalstep;
	}

	public void run() {
		while (step < totalstep) {
			boolean isHareSleep = flags[((int) (Math.random() * 10)) % 2];

			if (isHareSleep) {
				System.out.println("兔子睡着了");
			} else {
				step += 2;
				System.out.printf("兔子跑了 %d 歩\n", step);
			}
		}
	}
}