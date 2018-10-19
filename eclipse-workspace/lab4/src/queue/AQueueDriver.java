package queue;

public class AQueueDriver {

	public static void main(String[] args) {
		AQueue<Integer> queue = new AQueue<Integer>(5);
		
		queue.enqueue(2);
		queue.enqueue(4);
		queue.showAll();
		
		System.out.println("dequeue: " + queue.dequeue());
		System.out.println("dequeue: " + queue.dequeue());
		queue.showAll();
		
		queue.enqueue(6);
		queue.enqueue(7);
		queue.enqueue(8);
		queue.showAll();
		
		System.out.println("front: " + queue.peek());
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.showAll();
		System.out.println("length: " + queue.length());
	}

}
