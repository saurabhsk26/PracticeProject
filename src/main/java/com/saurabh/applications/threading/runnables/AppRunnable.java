package com.saurabh.applications.threading.runnables;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AppRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
//		Runnable runnable =()->{
			
			try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\skuma892\\Downloads\\ECON_20200109150211_4329130 - Copy.txt"))){
				String line = null;
				while((line = reader.readLine()) != null) {
					System.out.println(Thread.currentThread().getName() + " -> " + line);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		};
	}
}
