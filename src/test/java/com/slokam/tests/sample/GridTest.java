package com.slokam.tests.sample;

import java.sql.Timestamp;
import java.time.Instant;

import org.testng.annotations.Test;

public class GridTest {

	@Test
	public void test1() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("Start test1 - GridTest:"+ timestamp );
		sleep(10);
		timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("Stopped test1 at :"+ timestamp );
	}

	@Test
	public void test2() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("Start test2 - GridTest :"+ timestamp );
		sleep(5);
		timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("Stopped test2 - GridTest :"+ timestamp );
	}
	
	@Test
	public void test3() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("Start test3 - GridTest :"+ timestamp );
		sleep(3);
		timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("Stopped test3 at :"+ timestamp );
	}
	
	@Test
	public void test4() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("Start test4 - GridTest :"+ timestamp );
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
