package ThreadTesting;

public class ThreadRunnable implements Runnable {

	private int time;
	private Thread th;
	public ThreadRunnable(String name, int n ){
		time = n;
		th = new Thread(this, name);
		th.start();
	}
	public void run(){
		for(int i=1; i<=5; i++){
			System.out.println(Thread.currentThread().getName() + "  " + i+ "times");
			try{
				th.sleep(time);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			if(i==5){
				System.out.println(Thread.currentThread().getName()+"Running out");
			}
			
		}
		
	}
	
	public static void main(String[] args){
		ThreadRunnable aa1 = new ThreadRunnable("Thread 1",500);
		ThreadRunnable aa2 = new ThreadRunnable("Thread 2",200);
		ThreadRunnable aa3 = new ThreadRunnable("Thread 3",300);
	}
	
}

/* sleep 是執行緒類別的方法，導致此執行緒暫停執行指定的時間，將執行機會讓給其他執行緒，但監控狀態依然保持，到時候自動恢復，呼叫sleep不會釋放物件鎖。
 * wait 是Object類別的方法，對此物品呼叫wait 方法導致本執行緒放棄物件鎖，進入等待此物件的等待鎖定池。只有針對此物件發出notify方法後，本執行緒才會進入物件鎖定池準備獲得物件鎖進入執行狀態。
 */
 
