package com.saurabh.applications.threading.runnables;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AppThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\skuma892\\Downloads\\ECON_20200109150211_4329130 - Copy.txt"))){
			while(reader.readLine() != null) {
				System.out.println(Thread.currentThread().getName() + " --> " + reader.readLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
