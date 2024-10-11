package com.bptn.course.exercises.thread_states;

public class RunnableState {

	public static void main(String[] args) {
		Runnable runnable = new NewState();
		Thread t = new Thread(runnable);
		t.start();
		System.out.println(t.getState());
	}
}

class NewState implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
