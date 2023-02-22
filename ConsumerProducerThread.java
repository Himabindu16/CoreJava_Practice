package in.ineuron.main;

class Producer extends Thread
{
	//Producer producing the data in StringBuffer
	StringBuffer sb;

	boolean dataProvider = false;
	
	public Producer()
	{
		sb = new StringBuffer();
	}
	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++)
		{
			
			try {
				sb.append(i + ": ");
				Thread.sleep(100);
				System.out.println("appending");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		//informing
		dataProvider = true;
	}
	
}

class Consumer extends Thread
{
	Producer producer;
	
	
	public Consumer(Producer producer) {
		super();
		this.producer = producer;
	}


	@Override
	public void run() {
		
		while(producer.dataProvider == false)
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	
		System.out.println(producer.sb);
	}

}

public class ConsumerProducerThread {

	public static void main(String[] args) {
		
		Producer obj1 = new Producer();
		Consumer obj2 = new Consumer(obj1);
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t2.start();
		t1.start();
		
	}

}
