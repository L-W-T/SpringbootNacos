package com.lwt.nacos.thread;

/**
 * 多线程练习（4种方式实现多线程）
 * @author Administrator
 *
 */
public class ThreadPractice {
	public static void main(String[] args) {
		ThreadDemo threadDemo = new ThreadDemo();
		threadDemo.start();
	}
}

class ThreadDemo extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j + "*" + i + "=" + (i * j) +"\t");
			}
			System.out.println("");
		}
	}
}
