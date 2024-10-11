//package com.bptn.course.exercises;
//
//public class TestThread implements Runnable {
//	public static Thread t1;
//
//	public static void main(String[] args) {
//
//		// t1 created and is currently in the NEW state.
//		t1 = new Thread(new TestThread());
//		System.out.println("State of thread1 after creating it - " + t1.getState());
//
//		// t1 moved to Runnable state
//		t1.start();
//		System.out.println("State of t1 after calling .start() method on it - " + t1.getState());
//	}
//
//	@Override
//	public void run() {
//		Thread t2 = new Thread(new TestRunnable());
//
//		// t2 created and is currently in the NEW state.
//		System.out.println("State of t2 after creating it - " + t2.getState());
//		t2.start();
//
//		// t2 moved to Runnable state
//		System.out.println("State of t2 after calling .start() method on it - " + t2.getState());
//
//		// moving t2 to timed waiting state
//		try {
//			// moving thread2 to timed waiting state
//			Thread.sleep(200);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("State of t2 after calling .sleep() method on it - " + t2.getState());
//
//		try {
//			// waiting for t2 to die
//			t2.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("State of t2 when it has finished it's execution - " + t2.getState());
//	}
//}
//
////Java program to demonstrate thread states
//class TestRunnable implements Runnable {
//	@Override
//	public void run() {
//		// moving thread2 to timed waiting state
//		try {
//			Thread.sleep(1500);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
//		System.out.println("State of t1 while it called join() method on t2 -" + TestThread.t1.getState());
//		try {
//			Thread.sleep(200);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//}
