class multithreading{
	public static void main(String[] args) throws Exception {
		first a = new first();
		second b = new second();
		a.start();
	    a.join();
		System.out.println("waiting for process 2 to join");
		b.start();
	}
}

class first extends Thread
{

	public void run() {
		for(int i=1;i<=400;i++)
		{
			System.out.println(i);
		}
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("exception occured");
		}
	}
	
}
class second extends Thread
{
	public void run() {
		for(int i=400;i<=999;i++)
		{
			System.out.println(i+1);
		}
		try
		{
			Thread.sleep(7000);
		}
		catch(Exception e)
		{
			System.out.println("exception occured");
		}
	}
	
}