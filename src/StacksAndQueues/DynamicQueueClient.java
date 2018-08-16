package StacksAndQueues;

import StacksAndQueues.QueueUsingArrays;

public class DynamicQueueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		QueueUsingArrays queue = new DynamicQueue(5);
		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i);
			displayQueueInfo(queue);
		}
		queue.dequeue();
		queue.enqueue(100);
		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i * 10);
			displayQueueInfo(queue);
		}
		// System.out.println(queue.dequeue());
		// queue.enqueue(6);
		// displayQueueInfo(queue);
		// while (!queue.isEmpty()) {
		// displayQueueInfo(queue);
		// queue.dequeue();
		// }
		//
		// queue.dequeue();

	}

	public static void displayQueueInfo(QueueUsingArrays q) throws Exception {
		System.out.println("****************************************");
		q.display();
		System.out.println(q.front());
		System.out.println(q.size());
		System.out.println("****************************************");
	}

}
