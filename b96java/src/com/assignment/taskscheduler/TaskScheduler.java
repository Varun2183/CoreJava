package com.assignment.taskscheduler;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TaskScheduler {

	 private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

	    public void scheduleTask(Task task, int interval) {
	        scheduler.scheduleAtFixedRate(task::execute, 0, interval, TimeUnit.SECONDS);
	    }

	    public void shutdown() {
	        scheduler.shutdown();
	        try {
	            if (!scheduler.awaitTermination(60, TimeUnit.SECONDS)) {
	                scheduler.shutdownNow();
	            }
	        } catch (InterruptedException e) {
	            scheduler.shutdownNow();
	        }
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 TaskScheduler taskScheduler = new TaskScheduler();

	        // Schedule three different tasks with different intervals
	        taskScheduler.scheduleTask(() -> System.out.println("Task 1 executed"), 1);
	        taskScheduler.scheduleTask(() -> System.out.println("Task 2 executed"), 2);
	        taskScheduler.scheduleTask(() -> System.out.println("Task 3 executed"), 3);

	        // Let the tasks run for a while and then shut down the scheduler
	        try {
	            Thread.sleep(10000); // Let the tasks run for 10 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        taskScheduler.shutdown();
	}

}
