package ThreadTesting;

public class ThreadClass extends Thread {

	int time;
	public ThreadClass (int t){
		
		time = t;
	}
	
	public  synchronized void run(){
		for(int i = 0; i<= 5; i++){
			System.out.println(Thread.currentThread().getName() + "   " + i +"time");
			try{
				Thread.sleep(time);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			if(i == 5){
				System.out.println(Thread.currentThread().getName()+"stop");
			}
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadClass a1 = new ThreadClass(500);
				a1.setName("Thread 1");
		a1.start();
		ThreadClass a2 = new ThreadClass(200);
				a2.setName("Thread 2");
		a2.start();
		
	}

}
