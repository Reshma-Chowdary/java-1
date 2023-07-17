class thread1 extends Thread{
	public void run(){
		System.out.println("Thread1");
	}
	public void add(){
		System.out.println("add");
	}
}
class thread2 extends Thread{
	public void run(){
		System.out.println("Thread2");
	}
	public void sub(){
		System.out.println("sub");
	}
}
class thread{
	public static void main(String args[]){
		thread1 t1=new thread1();
		thread2 t2=new thread2();
		t1.start();
		t2.start();
		t1.add();
		t2.sub();
	}
}

