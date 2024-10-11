package com.bptn.course.exercises.thread_states;

public class WaitingState implements Runnable {
	public static Thread t1;

	public static void main(String[] args) {
		t1 = new Thread(new WaitingState());
		t1.start();
	}

	@Override
	public void run() {
		Thread t2 = new Thread(new DemoWaitingStateRunnable());
		t2.start();

		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class DemoWaitingStateRunnable implements Runnable {
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(WaitingState.t1.getState());
	}
}