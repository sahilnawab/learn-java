package example;

import java.util.ArrayList;

class MyThread implements Runnable 

{
	public void run () 
	{
		for(int i =0;i<3;i++) 
		{
			//Thread.yield();
			System.out.println("child thread 1");
			//Thread.sleep(1000);
		}
	}
}
class MyThread1 implements Runnable
{
	public void run() 
	{
		
		try {for (int i=0; i<3;i++) 
			{
				System.out.println("child thread 2");
				//Thread.sleep(1000);
			}}catch(Exception e) {System.out.println(e.getMessage());}	
	}
}


public class Test5 
{

	public static void main(String[] args) throws InterruptedException
	{	
		ArrayList m= new ArrayList();
		m.add(3);
		m.add("sahil");
		m.add(null);
		//m.add(5, "nawab");
		m.add("faizana");
		System.out.println(m);
		MyThread t = new MyThread();
		MyThread1 t1= new MyThread1();
		Thread s = new Thread(t);
		Thread s2= new Thread(t1);
		s2.start();
		s.start();
		s.join();
		//s2.join();
		try 
		{
			for ( int i=0; i<5;i++) 
			{
				System.out.println("main thread ");

				//Thread.sleep(1000);

			}
		}
		catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

}
