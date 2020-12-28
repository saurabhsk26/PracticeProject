package com.saurabh.applications.threading.mains;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import com.saurabh.applications.threading.runnables.AppRunnable;
import com.saurabh.applications.threading.runnables.AppThread;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		//Thread Class Example
		AppThread thread1 = new AppThread();
		AppThread thread2 = new AppThread();
		AppThread thread3 = new AppThread();
		
		thread1.start();
		thread2.start();
		thread3.start();
*/
	
		/*//Through Runnable interface
		Runnable rr = new AppRunnable();
		Thread thread1 = new Thread(rr);
		Thread thread2 = new Thread(rr);
		Thread thread3 = new Thread(rr);
		
		thread1.start();
		thread2.start();
		thread3.start();
		*/
		Runnable rr = new AppRunnable();
		Executor executor = Executors.newSingleThreadExecutor();
		
		Runnable r2 = new AppRunnable();
		Executor executor2 = Executors.newSingleThreadExecutor();
		
		executor.execute(rr);
		executor2.execute(r2);
	}

}
