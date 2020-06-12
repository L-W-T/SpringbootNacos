package com.lwt.nacos.thread;

public class TestRunnable {
	public static void main(String[] args) {
		RunnableDemo runnableDemo = new RunnableDemo();
		//runnableDemo.run();
		new Thread(runnableDemo).start();
	}
}

class RunnableDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println("");
		}
	}
	
}
