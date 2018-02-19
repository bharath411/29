package com.slokam.tests.sample;

import java.sql.Timestamp;
import java.time.Instant;

import org.testng.annotations.Test;

public class GridTest2 {

	@Test
	public void test5() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("Start test5 - GridTest2 - :"+ timestamp );
		sleep(1);
		timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("Stopped test5 - GridTest2 :"+ timestamp );
	}

	@Test
	public void test6() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("Start test6 - GridTest2 :"+ timestamp );
		sleep(6);
		timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("Stopped test6 at :"+ timestamp );
	}
	
	@Test
	public void test7() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("Start test7 - GridTest2 :"+ timestamp );
		sleep(20);
		timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("Stopped test7 at :"+ timestamp );
	}
	
	@Test
	public void test4() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("Start test4 - GridTest2 :"+ timestamp );
		sleep(15);
		timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("Stopped test4 at :"+ timestamp );
	}
	private void sleep(int i) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000*i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
