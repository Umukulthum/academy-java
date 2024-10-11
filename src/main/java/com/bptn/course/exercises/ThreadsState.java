//package com.bptn.course.exercises;
//
//public class ThreadsState implements Runnable {
//
//	public static Thread t1;
//
//	public static void main(String[] args) {
//		t1 = new Thread(new ThreadsState());
//		t1.start();
//	}
//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//
//		Thread t2 = new Thread(new CustomRunnable());
//		t2.start();
//
//		try {
//			t2.join();
//		} catch (InterruptedException e) {
//		}
//	}
//}
//
//class CustomRunnable implements Runnable {
//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//		}
//
//		System.out.println(ThreadsState.t1.getState());
//	}
//
//}
