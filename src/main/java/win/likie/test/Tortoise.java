package win.likie.test;

/**
 * Created by Wuhuahui on 2017/1/14.
 */
public class Tortoise implements Runnable {
	private int totalstep;
	private int step;

	public Tortoise(int totalstep) {
		this.totalstep = totalstep;
	}

	@Override
	public void run() {
		while (step < totalstep) {
			step++;
			System.out.printf("乌龟跑了 %d 歩\n", step);
		}
	}
}