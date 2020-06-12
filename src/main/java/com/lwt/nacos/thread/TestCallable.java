package com.lwt.nacos.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class TestCallable {
	public static void main(String[] args) {
		CallableDemo callableDemo = new CallableDemo();
		/*
		 * try { callableDemo.call(); } catch (Exception e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */
		FutureTask futureTask = new FutureTask<>(callableDemo); 
		new Thread(futureTask).start();
	}
}


class CallableDemo implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println("");
		}
		return null;
	}
	
}