class thread1 implements Runnable{
	public void run(){
		System.out.println("Thread1");
		add();
	}
	public void add(){
		System.out.println("add");
	}
}
class thread2 implements Runnable{
	public void run(){
		System.out.println("Thread2");
	}
}
class runnable{
	public static void main(String args[]){
		thread1 t1=new thread1();
		thread2 t2=new thread2();
		Thread T1=new Thread(t1);
		Thread T2=new Thread(t2);
		T1.start();
		T2.start();
	}
}

