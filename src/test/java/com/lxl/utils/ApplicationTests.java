package com.lxl.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Test
	public void contextLoads() {

		MThread mThread = new MThread();
		Thread Thread1 = new Thread(mThread, "Thread1");
		Thread Thread2 = new Thread(mThread, "Thread2");
		Thread Thread3 = new Thread(mThread, "Thread3");
		Thread1.start();
		Thread2.start();
		Thread3.start();
	}

}

class MThread extends Thread {

	public static Integer totalTicket = 100;


	private int numA = 0;          //统计ThreadA卖的票数
	private int numB = 0;          //统计ThreadB卖的票数
	private int numC = 0;          //统计ThreadC卖的票数

	@Override
	public void run() {
		sale();
	}

	public void sale() {
		while (this.totalTicket > 0) {
			//获取当前线程
			String name = Thread.currentThread().getName();
			if (name.equals("Thread1")) {
				numA++;
			}
			if (name.equals("Thread2")) {
				numB++;
			}
			if (name.equals("Thread3")) {
				numC++;
			}
			this.totalTicket--;
		}
		System.out.println("ThreadA 卖票:" + numA +
				",ThreadB 卖票:" + numB +
				",ThreadC 卖票:" + numC);

	}
}
