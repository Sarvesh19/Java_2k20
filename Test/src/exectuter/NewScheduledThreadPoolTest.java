package exectuter;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class NewScheduledThreadPoolTest {
	public static void main(final String... args) throws InterruptedException, ExecutionException {
		
		
		
		// creates thread pool with 2 thread
		final ScheduledExecutorService schExService = Executors.newScheduledThreadPool(2);
		
		
		
		// Object creation of runnable thread.
		final Runnable ob = new NewScheduledThreadPoolTest().new DemoThread();
		// Thread scheduling
		schExService.scheduleWithFixedDelay(ob, 2, 3, TimeUnit.SECONDS);
		// waits for termination for 30 seconds only
		schExService.awaitTermination(10, TimeUnit.SECONDS);
		// shutdown now.
		schExService.shutdownNow();
		System.out.println("Shutdown Complete");
		
		
		
	}

	// Runnable thread
	class DemoThread implements Runnable {
		@Override
		public void run() {
			int cnt = 0;
			for (; cnt < 2; cnt++) {
				System.out.println("runnable thread:" + cnt);
			}
			System.out.println("Done");
		}
	}
}
